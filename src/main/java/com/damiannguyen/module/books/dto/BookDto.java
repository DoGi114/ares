package com.damiannguyen.module.books.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement
public class BookDto {
    private Long id;
    private String author;
    private String title;
    private BookDetailsDto detailsDto;
    private Set<String > tags;

    public Long getId() {
        return id;
    }

    public BookDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public BookDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BookDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookDetailsDto getDetailsDto() {
        return detailsDto;
    }

    public BookDto setDetailsDto(BookDetailsDto detailsDto) {
        this.detailsDto = detailsDto;
        return this;
    }

    public Set<String> getTags() {
        return tags;
    }

    public BookDto setTags(Set<String> tags) {
        this.tags = tags;
        return this;
    }
}
