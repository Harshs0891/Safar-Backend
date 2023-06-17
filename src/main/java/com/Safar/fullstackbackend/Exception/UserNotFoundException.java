package com.Safar.fullstackbackend.Exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("could not found the user with id "+ id);
    }
}
