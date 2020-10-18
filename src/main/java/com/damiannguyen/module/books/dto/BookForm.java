package com.damiannguyen.module.books.dto;

import javax.validation.constraints.NotNull;
import java.util.Set;

public class BookForm {
    @NotNull(message = "Author for book is required!")
    private String author;
    @NotNull(message = "Title for book is required!")
    private String title;
    private String isbn;
    private String lang;
    private Set<String> tags;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getLang() {
        return lang;
    }

    public Set<String> getTags() {
        return tags;
    }
}
