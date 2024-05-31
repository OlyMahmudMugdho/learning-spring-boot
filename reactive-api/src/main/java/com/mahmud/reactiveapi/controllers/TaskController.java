package com.mahmud.reactiveapi.controllers;

import com.mahmud.reactiveapi.entity.Todo;
import com.mahmud.reactiveapi.model.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private Tasks tasks;

    @Autowired
    public TaskController(Tasks tasks) {
        this.tasks = tasks;
    }


    @GetMapping
    public Flux<List<Todo>> getAllTasks() {
        List<Todo> allTodos = tasks.getTodos();
        return Flux.just(allTodos);
    }

    @PostMapping
    public Mono<Todo> createTask(@RequestBody Todo task) {
        tasks.addTodo(task);
        return Mono.just(task);
    }

    @GetMapping("{id}")
    public ResponseEntity<Mono<Todo>> getTask(@PathVariable int id) {
        List<Todo> todos = tasks.getTodos().stream().filter(todo -> todo.getId() == id).toList();

        if (todos.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Mono<Todo> todo =  Mono.justOrEmpty(tasks.getTodos().stream().filter(t -> t.getId() == id).toList().getFirst());
        return ResponseEntity.ok(todo);
    }
}
