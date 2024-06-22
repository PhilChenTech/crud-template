package com.eastrabbit.crudtemplate.book.usecase.findbypk;

import com.eastrabbit.crudtemplate.book.entity.BookEntity;
import com.eastrabbit.crudtemplate.book.usecase.BookServiceException;
import com.eastrabbit.crudtemplate.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FindByPkBookUseCaseImpl implements FindByPkBookUseCase
{    private final BookRepository bookRepository;
    @Override
    public FindByPkBookUseCaseOutput findByPk(FindByPkBookUseCaseInPut findByPkBookUseCaseInPut) throws BookServiceException {
        Optional<BookEntity> bookEntityOpt = bookRepository.findById(pk);
        return bookEntityOpt.orElseThrow(() -> new BookServiceException("book not found , pk = " + pk));
    }
}
