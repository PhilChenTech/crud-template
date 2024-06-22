package com.eastrabbit.crudtemplate.book.controller.delete;

import com.fasterxml.jackson.annotation.JsonProperty;

 record DeleteBookRequest(@JsonProperty("pk") Long pk) {
}
