package com.eastrabbit.crudtemplate.book.usecase.update;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UpdateBookUseCaseInput(Long pk, String name, String author) {}
