package com.eastrabbit.crudtemplate.book.usecase.update;


import com.eastrabbit.crudtemplate.book.usecase.BookServiceException;

public interface UpdateBookUseCase {


    UpdateBookUseCaseOutput update(UpdateBookUseCaseInput updateBookRequest) ;


}
