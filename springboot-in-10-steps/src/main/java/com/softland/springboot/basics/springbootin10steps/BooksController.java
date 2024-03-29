package com.softland.springboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBoks() {
		return Arrays.asList(new Book(1l, "Spring boot", "Marco Hinojosa"));
	}
}
