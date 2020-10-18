package com.damiannguyen.module.books.mapper;

import com.damiannguyen.module.books.dto.BookDetailsDto;
import com.damiannguyen.module.books.entity.BooksDetailsEntity;

public class BookDetailsMapper {

    public static BookDetailsDto map(BooksDetailsEntity booksDetailsEntity){
        if(booksDetailsEntity == null){
            return new BookDetailsDto();
        }else{
            return  new BookDetailsDto()
                    .setIsbn(booksDetailsEntity.getIsbn())
                    .setLang(booksDetailsEntity.getLang());
        }
    }
}
