package com.example.phoneshop_night.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends ApiException{
    public ResourceNotFoundException(String resourceName, Integer id){
        super(HttpStatus.NOT_FOUND, "%s With id = %d not found".formatted(resourceName, id)  );
    }
}
