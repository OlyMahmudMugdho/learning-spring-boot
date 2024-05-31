package com.mahmud.reactiveapi.controllers;

import com.mahmud.reactiveapi.entity.Todo;
import com.mahmud.reactiveapi.model.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

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
    public Mono<Todo> getTask(@PathVariable int id) {
        return Mono.just(tasks.getTodos().stream().filter(t -> t.getId() == id).toList().getFirst());
    }
}
