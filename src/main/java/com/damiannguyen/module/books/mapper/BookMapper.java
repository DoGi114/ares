package com.damiannguyen.module.books.mapper;

import com.damiannguyen.module.books.dto.BookDto;
import com.damiannguyen.module.books.entity.BooksEntity;

import java.util.List;
import java.util.stream.Collectors;

public class BookMapper {
    public static BookDto map(BooksEntity booksEntity){
        return new BookDto()
                .setId(booksEntity.getId())
                .setAuthor(booksEntity.getAuthor())
                .setTitle(booksEntity.getTitle())
                .setDetailsDto(BookDetailsMapper.map(booksEntity.getDetails()))
                .setTags(BookTagsMapper.map(booksEntity.getTags()));
    }

    public static List<BookDto> map(List<BooksEntity> booksEntity){
        return booksEntity
                .stream()
                .map(BookMapper::map)
                .collect(Collectors.toList());
    }
}
