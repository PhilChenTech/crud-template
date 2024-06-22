package com.eastrabbit.crudtemplate.book.usecase.create;


import com.eastrabbit.crudtemplate.book.entity.BookEntity;
import com.eastrabbit.crudtemplate.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateBookUesCaseImpl implements CreateBookUesCase {

    private final BookRepository bookRepository;
    @Override
    public void create(CreateBookUesCaseInput createBookUesCaseInput) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setName(createBookUesCaseInput.name());
        bookEntity.setAuthor(createBookUesCaseInput.author());
         bookRepository.save(bookEntity);
    }
}
