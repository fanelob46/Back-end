package com.crud.back_end.exeption;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found user with id" + id);
    }
}
