package com.eastrabbit.crudtemplate.book.controller.delete;

import com.eastrabbit.crudtemplate.common.ErrorResponse;
import com.eastrabbit.crudtemplate.book.usecase.BookServiceException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
 class DeleteBookController {
    private final BookService bookService;

    @PostMapping("v1/delete")
     ResponseEntity<?> deleteByPk(@RequestBody DeleteBookRequest deleteBookRequest) {
        try {
            bookService.delete(deleteBookRequest);
            return ResponseEntity.ok().build();
        } catch (BookServiceException e) {
            return ResponseEntity.badRequest().body(new ErrorResponse(400, e.getMessage()));
        }
    }


}
