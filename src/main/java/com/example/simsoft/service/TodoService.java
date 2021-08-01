package com.example.simsoft.service;

import com.example.simsoft.entity.TodoEntity;
import com.example.simsoft.entity.UserEntity;
import com.example.simsoft.repository.TodoRepo;
import com.example.simsoft.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepo todoRepo;

    @Autowired
    private UserRepo userRepo;

    public TodoEntity creatTodo(TodoEntity todo, Long userid){
        UserEntity user = userRepo.findById(userid).get();
        todo.setUser(user);
        return todoRepo.save(todo);
    }

    public TodoEntity complete(Long id){
        TodoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return todoRepo.save(todo);
    }
}
