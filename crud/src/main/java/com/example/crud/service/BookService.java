package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.constants.BookConstants;
import com.example.crud.model.BookModel;
import com.example.crud.repository.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	public void createBookService(BookModel book) {
		try {
		bookRepo.save(book);
		}catch(Exception ex) {
			throw ex;
		}

	}

	public String updateBookService(BookModel book) {
		BookModel oldBook = null;
		try {
		Optional<BookModel> optionalBook = bookRepo.findById(book.getId());
		if (optionalBook.isPresent()) {
			oldBook = optionalBook.get();
			oldBook.setBookCategory(book.getBookCategory());
			oldBook.setBookPrice(book.getBookPrice());
			oldBook.setBookRating(book.getBookRating());
			oldBook.setBookName(book.getBookName());
			bookRepo.save(oldBook);
			return BookConstants.UPDATED_SUCCESSFULLY;
		} else {
			return BookConstants.BOOK_UNAVAILABLE;
		}
		}catch(Exception ex) {
			throw ex;
		}

	}

	public List<BookModel> getBookService() {
		try {
		List<BookModel> bookList = bookRepo.findAll();
		return bookList;
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public String deleteBookService(Long id) {
		try {
		bookRepo.deleteById(id);
		return BookConstants.DELETED_SUCCESSFULLY;
		}catch(Exception ex) {
			throw ex;
		}
	}

}
