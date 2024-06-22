package com.eastrabbit.crudtemplate.book.usecase.delete;

import com.eastrabbit.crudtemplate.book.entity.BookEntity;
import com.eastrabbit.crudtemplate.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DeleteBookUseCaseImpl implements DeleteBookUseCase {
  private final BookRepository bookRepository;

  @Override
  public void delete(DeleteBookUseCaseInput deleteBookUseCaseInput) {
    Optional<BookEntity> bookEntityOptional = bookRepository.findById(deleteBookUseCaseInput.pk());
    if (bookEntityOptional.isPresent()) {
      BookEntity bookEntity = bookEntityOptional.get();
      bookRepository.delete(bookEntity);
    }
  }
}
