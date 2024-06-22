package com.eastrabbit.crudtemplate.book.usecase.findbypk;

import com.fasterxml.jackson.annotation.JsonProperty;

public record FindByPkBookUseCaseOutput(Long pk, String name, String author) {}
