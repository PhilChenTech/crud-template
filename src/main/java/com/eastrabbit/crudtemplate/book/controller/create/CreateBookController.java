package com.eastrabbit.crudtemplate.book.controller.create;

import com.eastrabbit.crudtemplate.book.usecase.create.CreateBookUesCase;
import com.eastrabbit.crudtemplate.book.usecase.create.CreateBookUesCaseInput;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
 class CreateBookController {
    private final CreateBookUesCase createBookUesCase;


    @PostMapping("v1/create")
     void create(@RequestBody CreateBookRequest createBookRequest) {
        createBookUesCase.create(createBookRequest);
    }


     CreateBookUesCaseInput map(CreateBookRequest createBookRequest){


    }

}
