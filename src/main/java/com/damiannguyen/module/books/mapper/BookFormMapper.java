package com.damiannguyen.module.books.mapper;

import com.damiannguyen.module.books.dto.BookForm;
import com.damiannguyen.module.books.entity.BooksDetailsEntity;
import com.damiannguyen.module.books.entity.BooksEntity;
import com.damiannguyen.module.books.entity.BooksTagsEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class BookFormMapper {
    public static BooksEntity map(BookForm bookForm){
        BooksEntity booksEntity = new BooksEntity();
        return booksEntity
                .setAuthor(bookForm.getAuthor())
                .setTitle(bookForm.getTitle())
                .setDetails(getDetails(bookForm))
                .setTags(getTags(bookForm, booksEntity));
    }

    private static BooksDetailsEntity getDetails(BookForm bookForm) {
        return new BooksDetailsEntity()
                .setIsbn(bookForm.getIsbn())
                .setLang(bookForm.getLang());
    }

    private static Set<BooksTagsEntity> getTags(BookForm bookForm, BooksEntity booksEntity){
        return bookForm
                .getTags()
                .stream()
                .map( tag -> new BooksTagsEntity()
                        .setValue(tag)
                        .setBook(booksEntity)
                )
                .collect(Collectors.toSet());
    }
}
