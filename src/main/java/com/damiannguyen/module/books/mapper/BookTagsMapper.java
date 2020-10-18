package com.damiannguyen.module.books.mapper;

import com.damiannguyen.module.books.entity.BooksTagsEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class BookTagsMapper {

    public static String map(BooksTagsEntity booksTagsEntity){
        return booksTagsEntity.getValue();
    }

    public static Set<String> map(Set<BooksTagsEntity> booksTagsEntities){
        if(booksTagsEntities == null){
            return Set.of();
        }else{
            return booksTagsEntities
                    .stream()
                    .map(BookTagsMapper::map)
                    .collect(Collectors.toSet());
        }
    }
}
