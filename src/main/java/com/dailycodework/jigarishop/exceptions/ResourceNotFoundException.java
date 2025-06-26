package com.dailycodework.jigarishop.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String messege) {
        super(messege);
    }
}
