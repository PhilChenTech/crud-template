package com.eastrabbit.crudtemplate.book.controller.update;

import com.eastrabbit.crudtemplate.common.ErrorResponse;
import com.eastrabbit.crudtemplate.book.usecase.BookServiceException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
 class UpdateBookController {
    private final BookService bookService;


    @PostMapping("v1/update")
     ResponseEntity<?> update(@RequestBody UpdateBookRequest updateBookRequest) {
        try {
            bookService.update(updateBookRequest);
            return ResponseEntity.ok().build();
        } catch (BookServiceException e) {
            return ResponseEntity.badRequest().body(new ErrorResponse(400, e.getMessage()));
        }
    }



}
