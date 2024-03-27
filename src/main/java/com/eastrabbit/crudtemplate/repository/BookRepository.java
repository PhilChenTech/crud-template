package com.eastrabbit.crudtemplate.repository;

import com.eastrabbit.crudtemplate.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
