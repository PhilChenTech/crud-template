package com.eastrabbit.crudtemplate.book.controller.findbypk;

import com.fasterxml.jackson.annotation.JsonProperty;

 record FindBookByPkResponse(@JsonProperty("pk") Long pk, @JsonProperty("name") String name,
                                   @JsonProperty("author") String author) {
}
