package com.eastrabbit.crudtemplate.book.usecase.update;

import com.eastrabbit.crudtemplate.book.entity.BookEntity;
import com.eastrabbit.crudtemplate.book.repository.BookRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateBookUseCaseImpl implements UpdateBookUseCase {
  private final BookRepository bookRepository;

  @Override
  public UpdateBookUseCaseOutput update(UpdateBookUseCaseInput updateBookRequest) {
    Optional<BookEntity> bookEntityOpt = bookRepository.findById(updateBookRequest.pk());
    if (bookEntityOpt.isPresent()) {
      BookEntity bookEntity = bookEntityOpt.get();
      bookEntity.setAuthor(updateBookRequest.author());
      bookEntity.setName(updateBookRequest.name());
      BookEntity savedEntity = bookRepository.save(bookEntity);
      return new UpdateBookUseCaseOutput(
          savedEntity.getPk(), savedEntity.getName(), savedEntity.getAuthor());
    }
    throw new RuntimeException();
  }
}
