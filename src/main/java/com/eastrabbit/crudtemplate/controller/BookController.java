package com.eastrabbit.crudtemplate.controller;

import com.eastrabbit.crudtemplate.entity.BookEntity;
import com.eastrabbit.crudtemplate.service.BookService;
import com.eastrabbit.crudtemplate.service.BookServiceException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("v1/create")
    public void create(@RequestBody CreateBookRequest createBookRequest) {
        bookService.create(createBookRequest);
    }

    @GetMapping("v1/find-by-pk/{pk}")
    public ResponseEntity<?> findByPk(@PathVariable Long pk) {
        try {
            BookEntity bookEntity = bookService.findByPk(pk);
            FindBookByPkResponse findBookByPkResponse = new FindBookByPkResponse(bookEntity.getPk(), bookEntity.getName(), bookEntity.getAuthor());
            return ResponseEntity.ok(findBookByPkResponse);
        } catch (BookServiceException e) {
            return ResponseEntity.badRequest().body(new ErrorResponse(400, e.getMessage()));
        }
    }

    @PostMapping("v1/update")
    public ResponseEntity<?> update(@RequestBody UpdateBookRequest updateBookRequest) {
        try {
            bookService.update(updateBookRequest);
            return ResponseEntity.ok().build();
        } catch (BookServiceException e) {
            return ResponseEntity.badRequest().body(new ErrorResponse(400, e.getMessage()));
        }
    }

    @PostMapping("v1/delete")
    public ResponseEntity<?> deleteByPk(@RequestBody DeleteBookRequest deleteBookRequest) {
        try {
            bookService.delete(deleteBookRequest);
            return ResponseEntity.ok().build();
        } catch (BookServiceException e) {
            return ResponseEntity.badRequest().body(new ErrorResponse(400, e.getMessage()));
        }
    }


}
