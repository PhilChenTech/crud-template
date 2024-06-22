package com.eastrabbit.crudtemplate.book.usecase.delete;

import com.eastrabbit.crudtemplate.book.entity.BookEntity;
import com.eastrabbit.crudtemplate.book.usecase.BookServiceException;
import com.eastrabbit.crudtemplate.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DeleteBookUseCaseImpl implements DeleteBookUseCase {
    private final BookRepository bookRepository;
    @Override
    public void delete(DeleteBookUseCaseInput deleteBookUseCaseInput) throws BookServiceException {
        Optional<BookEntity> bookEntityOpt = bookRepository.findById(deleteBookRequest.pk());
        BookEntity bookEntity = bookEntityOpt.orElseThrow(() -> new BookServiceException("book not found , pk = " + deleteBookRequest.pk()));
        bookRepository.delete(bookEntity);
    }
}
