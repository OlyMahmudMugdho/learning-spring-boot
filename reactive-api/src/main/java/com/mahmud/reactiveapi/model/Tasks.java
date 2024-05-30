package com.mahmud.reactiveapi.model;

import com.mahmud.reactiveapi.entity.Todo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Tasks {
    private List<Todo> todos = new ArrayList<>();

    public Todo addTodo(Todo todo) {
        todos.add(todo);
        return todo;
    }
}
