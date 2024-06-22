package com.eastrabbit.crudtemplate.book.controller.create;

import com.fasterxml.jackson.annotation.JsonProperty;

 record CreateBookRequest(@JsonProperty("name") String name, @JsonProperty("author") String author) {
}
