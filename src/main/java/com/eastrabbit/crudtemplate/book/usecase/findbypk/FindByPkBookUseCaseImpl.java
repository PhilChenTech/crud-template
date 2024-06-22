package com.eastrabbit.crudtemplate.book.usecase.findbypk;

import com.eastrabbit.crudtemplate.book.entity.BookEntity;
import com.eastrabbit.crudtemplate.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FindByPkBookUseCaseImpl implements FindByPkBookUseCase {
  private final BookRepository bookRepository;

  @Override
  public FindByPkBookUseCaseOutput findByPk(FindByPkBookUseCaseInput findByPkBookUseCaseInPut) {
    Optional<BookEntity> bookEntityOpt = bookRepository.findById(findByPkBookUseCaseInPut.pk());

    if (bookEntityOpt.isPresent()) {
      BookEntity bookEntity = bookEntityOpt.get();
      return new FindByPkBookUseCaseOutput(
          bookEntity.getPk(), bookEntity.getName(), bookEntity.getAuthor());
    }
    throw new RuntimeException();
  }
}
