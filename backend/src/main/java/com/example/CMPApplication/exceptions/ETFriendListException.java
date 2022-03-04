package com.example.CMPApplication.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class ETFriendListException extends RuntimeException{
    public ETFriendListException(String message){
        super(message);
    }
}
