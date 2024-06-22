package com.eastrabbit.crudtemplate.book.controller.delete;

import com.fasterxml.jackson.annotation.JsonProperty;

 record DeleteBookByPkRequest(@JsonProperty("pk") Long pk) {
}
