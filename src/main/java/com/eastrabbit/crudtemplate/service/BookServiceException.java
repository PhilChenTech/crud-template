package com.eastrabbit.crudtemplate.service;

import lombok.Getter;

@Getter
public class BookServiceException extends Exception {
    private final String message;

    public BookServiceException(String message) {
        this.message = message;
    }
}
