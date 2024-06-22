package com.eastrabbit.crudtemplate.book.usecase.update;

import com.eastrabbit.crudtemplate.book.entity.BookEntity;
import com.eastrabbit.crudtemplate.repository.BookRepository;
import com.eastrabbit.crudtemplate.book.usecase.BookServiceException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UpdateBookUseCaseImpl implements UpdateBookUseCase
{    private final BookRepository bookRepository;
    @Override
    public UpdateBookUseCaseOutput update(UpdateBookUseCaseInput updateBookRequest) throws BookServiceException {
        Optional<BookEntity> bookEntityOpt = bookRepository.findById(updateBookRequest.pk());
        BookEntity bookEntity = bookEntityOpt.orElseThrow(() -> new BookServiceException("book not found , pk = " + updateBookRequest.pk()));
        bookEntity.setAuthor(updateBookRequest.author());
        bookEntity.setName(updateBookRequest.name());
        return bookRepository.save(bookEntity);
    }
}
