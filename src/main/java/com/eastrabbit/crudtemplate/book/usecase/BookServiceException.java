package com.eastrabbit.crudtemplate.book.usecase;

import lombok.Getter;

@Getter
public class BookServiceException extends Exception {
    private final String message;

    public BookServiceException(String message) {
        this.message = message;
    }
}
