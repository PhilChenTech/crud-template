package com.eastrabbit.crudtemplate.book.controller.update;

import com.eastrabbit.crudtemplate.book.usecase.update.UpdateBookUseCase;
import com.eastrabbit.crudtemplate.book.usecase.update.UpdateBookUseCaseInput;
import com.eastrabbit.crudtemplate.common.ErrorResponse;
import com.eastrabbit.crudtemplate.book.usecase.BookServiceException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
class UpdateBookController {
  private final UpdateBookUseCase updateBookUseCase;

  @PostMapping("v1/update")
  void update(@RequestBody UpdateBookRequest updateBookRequest) {
    UpdateBookUseCaseInput updateBookUseCaseInput = map(updateBookRequest);
    updateBookUseCase.update(updateBookUseCaseInput);
  }

  static UpdateBookUseCaseInput map(UpdateBookRequest updateBookRequest) {
    return new UpdateBookUseCaseInput(
        updateBookRequest.pk(), updateBookRequest.name(), updateBookRequest.author());
  }
}
