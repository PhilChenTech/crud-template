package com.eastrabbit.crudtemplate.book.controller.create;

import com.eastrabbit.crudtemplate.book.usecase.create.CreateBookUesCaseInput;

public class CreateBookRequestMapper {

  static CreateBookUesCaseInput map(CreateBookRequest createBookRequest) {
    return new CreateBookUesCaseInput(createBookRequest.name(), createBookRequest.author());
  }
}
