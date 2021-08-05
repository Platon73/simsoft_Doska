package com.example.simsoft.controller;

import com.example.simsoft.entity.TodoEntity;
import com.example.simsoft.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity creatTodo(@RequestBody TodoEntity todo,
                                    @RequestParam Long userId,
                                    @RequestParam Long releaseId){
        try {
            return ResponseEntity.ok(todoService.creatTodo(todo, userId, releaseId));
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping
    public ResponseEntity completeTodo(@RequestParam Long id){
        try {
            return ResponseEntity.ok(todoService.complete(id));
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
