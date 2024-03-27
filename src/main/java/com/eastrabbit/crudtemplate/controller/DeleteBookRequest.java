package com.eastrabbit.crudtemplate.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DeleteBookRequest(@JsonProperty("pk") Long pk) {
}
