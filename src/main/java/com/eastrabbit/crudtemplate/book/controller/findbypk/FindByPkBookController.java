package com.eastrabbit.crudtemplate.book.controller.findbypk;

import com.eastrabbit.crudtemplate.book.usecase.findbypk.FindByPkBookUseCase;
import com.eastrabbit.crudtemplate.book.usecase.findbypk.FindByPkBookUseCaseInput;
import com.eastrabbit.crudtemplate.book.usecase.findbypk.FindByPkBookUseCaseOutput;
import com.eastrabbit.crudtemplate.common.ErrorResponse;
import com.eastrabbit.crudtemplate.book.entity.BookEntity;
import com.eastrabbit.crudtemplate.book.usecase.BookServiceException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
class FindByPkBookController {
  private final FindByPkBookUseCase findByPkBookUseCase;

  @GetMapping("v1/find-by-pk/{pk}")
  ResponseEntity<?> findByPk(FindBookByPkRequest findBookByPkRequest) {

    FindByPkBookUseCaseOutput findByPkBookUseCaseOutput =
        findByPkBookUseCase.findByPk(new FindByPkBookUseCaseInput(findBookByPkRequest.pk()));
    FindBookByPkResponse findBookByPkResponse =
        new FindBookByPkResponse(
            findByPkBookUseCaseOutput.pk(),
            findByPkBookUseCaseOutput.name(),
            findByPkBookUseCaseOutput.author());
    return ResponseEntity.ok(findBookByPkResponse);
  }
}
