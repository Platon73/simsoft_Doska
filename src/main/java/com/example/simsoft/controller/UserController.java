package com.example.simsoft.controller;

import com.example.simsoft.entity.UserEntity;
import com.example.simsoft.exeption.UserAlredyExistException;
import com.example.simsoft.repository.UserRepo;
import com.example.simsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity registretion(@RequestBody UserEntity user){
        try {
            userService.registretion(user);
            return ResponseEntity.ok("Пользователь созранен");
        } catch (UserAlredyExistException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e){
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
