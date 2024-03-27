package com.eastrabbit.crudtemplate.service;

import com.eastrabbit.crudtemplate.controller.CreateBookRequest;
import com.eastrabbit.crudtemplate.controller.DeleteBookRequest;
import com.eastrabbit.crudtemplate.controller.FindBookByPkRequest;
import com.eastrabbit.crudtemplate.controller.UpdateBookRequest;
import com.eastrabbit.crudtemplate.entity.BookEntity;

public interface BookService {

    BookEntity create(CreateBookRequest createBookRequest);

    BookEntity update(UpdateBookRequest updateBookRequest) throws BookServiceException;

    BookEntity findByPk(Long pk) throws BookServiceException;


    void delete(DeleteBookRequest deleteBookRequest) throws BookServiceException;

}
