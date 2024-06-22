package com.eastrabbit.crudtemplate.repository;

import com.eastrabbit.crudtemplate.book.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
