package com.eastrabbit.crudtemplate.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public record FindBookByPkRequest(@JsonProperty("pk") Long pk) {
}
