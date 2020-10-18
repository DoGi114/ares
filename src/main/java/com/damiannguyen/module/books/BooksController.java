package com.damiannguyen.module.books;

import com.damiannguyen.module.books.dto.BookDto;
import com.damiannguyen.module.books.dto.BookForm;
import com.damiannguyen.module.books.entity.BooksEntity;
import com.damiannguyen.module.books.mapper.BookFormMapper;
import com.damiannguyen.module.books.mapper.BookMapper;
import com.damiannguyen.module.books.repository.BooksRepository;
import com.damiannguyen.module.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BooksController {

	@Autowired
	private BookService bookService;

	@GetMapping(value = "/api/books/{id}", produces = {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
	})
	public BookDto getBook(@PathVariable Long id) {
		return BookMapper.map(bookService.getOne(id));
	}

	@GetMapping("/api/books")
	public List<BookDto> getBooks() {
		return BookMapper.map(bookService.getAll());
	}

	@PostMapping("/api/books")
	public BookDto newBooks(@Valid @RequestBody BookForm bookForm) {
		BooksEntity booksEntity = BookFormMapper.map(bookForm);
		return BookMapper.map(bookService.create(booksEntity));
	}

	@PutMapping("/api/books/{id}")
	public BookDto updateBooks(@PathVariable Long id,
	                               @RequestBody BooksEntity booksEntity) {
		return BookMapper.map(bookService.update(booksEntity, id));
	}

	@DeleteMapping("/api/books/{id}")
	public void deleteBooks(@PathVariable Long id) {
		bookService.delete(id);
	}
}
