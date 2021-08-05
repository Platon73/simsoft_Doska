package com.example.simsoft.controller;

import com.example.simsoft.entity.ReleaseEntity;
import com.example.simsoft.entity.TodoEntity;
import com.example.simsoft.service.ReleaseService;
import com.example.simsoft.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/release")
public class ReleaseController {

    @Autowired
    private ReleaseService releaseService;

    @PostMapping
    public ResponseEntity creatRelease(@RequestBody ReleaseEntity releaseEntity){
        try {
            System.out.println(releaseEntity.toString());
            releaseService.creatRelease(releaseEntity);
            return ResponseEntity.ok("релиз успешно создан");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
