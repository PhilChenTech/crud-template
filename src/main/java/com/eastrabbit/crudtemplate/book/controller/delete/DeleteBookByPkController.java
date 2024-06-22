package com.eastrabbit.crudtemplate.book.controller.delete;

import com.eastrabbit.crudtemplate.book.usecase.delete.DeleteBookUseCase;
import com.eastrabbit.crudtemplate.book.usecase.delete.DeleteBookUseCaseInput;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
class DeleteBookByPkController {
  private final DeleteBookUseCase deleteBookUseCase;

  @PostMapping("v1/delete")
  void deleteByPk(@RequestBody DeleteBookByPkRequest deleteBookByPkRequest) {
    DeleteBookUseCaseInput deleteBookUseCaseInput = DeleteBookByPkRequestMapper.map(deleteBookByPkRequest);
    deleteBookUseCase.delete(deleteBookUseCaseInput);
  }
}
