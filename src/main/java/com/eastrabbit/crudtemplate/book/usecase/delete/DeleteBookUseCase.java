package com.eastrabbit.crudtemplate.book.usecase.delete;

import com.eastrabbit.crudtemplate.book.usecase.BookServiceException;

public interface DeleteBookUseCase {



    void delete(DeleteBookUseCaseInput deleteBookUseCaseInput) throws BookServiceException;

}
