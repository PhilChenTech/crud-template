package com.eastrabbit.crudtemplate.book.controller.update;

import com.fasterxml.jackson.annotation.JsonProperty;

 record UpdateBookRequest(@JsonProperty("pk") Long pk, @JsonProperty("name") String name,
                                @JsonProperty("author") String author) {
}
