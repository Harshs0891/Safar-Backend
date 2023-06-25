package com.Safar.fullstackbackend.Exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("could not found Booking with id "+ id);
    }
}
