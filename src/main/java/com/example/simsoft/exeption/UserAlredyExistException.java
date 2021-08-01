package com.example.simsoft.exeption;

public class UserAlredyExistException extends Exception{

    public UserAlredyExistException(String message){
        super(message);
    }
}
