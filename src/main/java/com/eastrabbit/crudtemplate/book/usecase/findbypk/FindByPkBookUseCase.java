package com.eastrabbit.crudtemplate.book.usecase.findbypk;

import com.eastrabbit.crudtemplate.book.usecase.BookServiceException;

public interface FindByPkBookUseCase {


    FindByPkBookUseCaseOutput findByPk(FindByPkBookUseCaseInPut findByPkBookUseCaseInPut) throws BookServiceException;


}
