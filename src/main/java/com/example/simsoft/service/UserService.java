package com.example.simsoft.service;

import com.example.simsoft.entity.UserEntity;
import com.example.simsoft.exeption.UserAlredyExistException;
import com.example.simsoft.exeption.UserNotFoundException;
import com.example.simsoft.model.User;
import com.example.simsoft.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserEntity registretion(@RequestBody UserEntity user) throws UserAlredyExistException {
        if (userRepo.findByUsername(user.getUsername()) != null){
            throw  new UserAlredyExistException("Тако пользователь ужеесть");
        }
        return userRepo.save(user);
    }

    public User getOne (Long id) throws UserNotFoundException {
        UserEntity user = userRepo.findById(id).get();
        if (user == null){
            throw new UserNotFoundException("Пользователь не найден");
        }
        return User.toModel(user);
    }
}
