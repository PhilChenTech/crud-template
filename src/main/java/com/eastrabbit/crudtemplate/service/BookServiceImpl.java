package com.eastrabbit.crudtemplate.service;

import com.eastrabbit.crudtemplate.controller.CreateBookRequest;
import com.eastrabbit.crudtemplate.controller.DeleteBookRequest;
import com.eastrabbit.crudtemplate.controller.FindBookByPkRequest;
import com.eastrabbit.crudtemplate.controller.UpdateBookRequest;
import com.eastrabbit.crudtemplate.entity.BookEntity;
import com.eastrabbit.crudtemplate.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity create(CreateBookRequest createBookRequest) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setName(createBookRequest.name());
        bookEntity.setAuthor(createBookRequest.author());
        return bookRepository.save(bookEntity);
    }

    @Override
    public BookEntity update(UpdateBookRequest updateBookRequest) throws BookServiceException {
        Optional<BookEntity> bookEntityOpt = bookRepository.findById(updateBookRequest.pk());
        BookEntity bookEntity = bookEntityOpt.orElseThrow(() -> new BookServiceException("book not found , pk = " + updateBookRequest.pk()));
        bookEntity.setAuthor(updateBookRequest.author());
        bookEntity.setName(updateBookRequest.name());
        return bookRepository.save(bookEntity);
    }

    @Override
    public BookEntity findByPk(Long pk) throws BookServiceException {
        Optional<BookEntity> bookEntityOpt = bookRepository.findById(pk);
        return bookEntityOpt.orElseThrow(() -> new BookServiceException("book not found , pk = " + pk));

    }


    @Override
    public void delete(DeleteBookRequest deleteBookRequest) throws BookServiceException {
        Optional<BookEntity> bookEntityOpt = bookRepository.findById(deleteBookRequest.pk());
        BookEntity bookEntity = bookEntityOpt.orElseThrow(() -> new BookServiceException("book not found , pk = " + deleteBookRequest.pk()));
        bookRepository.delete(bookEntity);
    }
}
