package com.eastrabbit.crudtemplate.book.controller.findbypk;

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
    private final BookService bookService;


    @GetMapping("v1/find-by-pk/{pk}")
     ResponseEntity<?> findByPk(@PathVariable Long pk) {
        try {
            BookEntity bookEntity = bookService.findByPk(pk);
            FindBookByPkResponse findBookByPkResponse = new FindBookByPkResponse(bookEntity.getPk(), bookEntity.getName(), bookEntity.getAuthor());
            return ResponseEntity.ok(findBookByPkResponse);
        } catch (BookServiceException e) {
            return ResponseEntity.badRequest().body(new ErrorResponse(400, e.getMessage()));
        }
    }



}
