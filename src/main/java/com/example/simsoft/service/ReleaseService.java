package com.example.simsoft.service;

import com.example.simsoft.entity.TodoEntity;
import com.example.simsoft.entity.UserEntity;
import com.example.simsoft.model.Todo;
import com.example.simsoft.repository.ReleaseRepo;
import com.example.simsoft.repository.TodoRepo;
import com.example.simsoft.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseService {

    @Autowired
    private ReleaseRepo releaseRepo;

//    @Autowired
//    private UserRepo userRepo;
//
//    public Todo creatTodo(TodoEntity todo, Long userid){
//        UserEntity user = userRepo.findById(userid).get();
//        todo.setUser(user);
//        return Todo.toModel(todoRepo.save(todo));
//    }
//
//    public Todo complete(Long id){
//        TodoEntity todo = todoRepo.findById(id).get();
//        todo.setCompleted(!todo.getCompleted());
//        return Todo.toModel(todoRepo.save(todo));
//    }
}
