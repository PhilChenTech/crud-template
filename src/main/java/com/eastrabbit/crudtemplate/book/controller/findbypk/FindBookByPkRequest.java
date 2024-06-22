package com.eastrabbit.crudtemplate.book.controller.findbypk;

import com.fasterxml.jackson.annotation.JsonProperty;

 record FindBookByPkRequest(@JsonProperty("pk") Long pk) {
}
