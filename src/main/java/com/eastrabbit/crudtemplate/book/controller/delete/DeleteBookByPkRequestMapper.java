package com.eastrabbit.crudtemplate.book.controller.delete;

import com.eastrabbit.crudtemplate.book.usecase.delete.DeleteBookUseCaseInput;

public class DeleteBookByPkRequestMapper {
static DeleteBookUseCaseInput map(DeleteBookByPkRequest deleteBookByPkRequest) {
    return new DeleteBookUseCaseInput(deleteBookByPkRequest.pk());
  }}