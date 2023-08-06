package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.BookModel;
import com.example.crud.service.BookService;

@RestController
public class BooksController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping(value ="/create")
	public String createBooks(@RequestBody BookModel book ) {
		
		try {
		bookService.createBookService(book);
		return "Book saved";
		}catch(Exception ex) {
			
			return ex.toString();
			
		}
		
		
	}
	
	@PutMapping("/update")
	public String updateBooks(@RequestBody BookModel book) {
		try {
		String response =bookService.updateBookService(book);
		return response;
		}catch(Exception ex) {
			return ex.toString();
		}
		
		
		
		
	}
	
	@GetMapping("/get")
	public List<BookModel> getBooks() {
		try {
		List<BookModel> bookList=bookService.getBookService();
		return bookList;
		}catch(Exception ex) {
			return (List<BookModel>) ex;
		}
		
	}
	
	@DeleteMapping("/delete")
	public String deleteBooks(@RequestParam Long id) {
		try {
		String response= bookService.deleteBookService(id);
		return response;
		}catch(Exception ex) {
			return ex.toString();
		}
	}

}
