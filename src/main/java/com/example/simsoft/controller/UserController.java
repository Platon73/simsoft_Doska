package com.example.simsoft.controller;

import com.example.simsoft.entity.UserEntity;
import com.example.simsoft.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public ResponseEntity registretion(@RequestBody UserEntity user){
        try {
            if (userRepo.findByUsername(user.getUsername()) != null){
                return ResponseEntity.badRequest().body("такой пользователь уже есть");
            }
            userRepo.save(user);
            return ResponseEntity.ok("Пользователь созранен");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping ("/")
    public ResponseEntity getUsers(){
        try {
            return ResponseEntity.ok("Сервер работает");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
