package com.eastrabbit.crudtemplate.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UpdateBookRequest(@JsonProperty("pk") Long pk, @JsonProperty("name") String name,
                                @JsonProperty("author") String author) {
}
