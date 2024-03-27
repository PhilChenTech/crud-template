package com.eastrabbit.crudtemplate.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public record FindBookByPkResponse(@JsonProperty("pk") Long pk, @JsonProperty("name") String name,
                                   @JsonProperty("author") String author) {
}
