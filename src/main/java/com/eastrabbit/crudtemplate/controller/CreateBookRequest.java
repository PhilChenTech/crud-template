package com.eastrabbit.crudtemplate.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CreateBookRequest(@JsonProperty("name") String name, @JsonProperty("author") String author) {
}
