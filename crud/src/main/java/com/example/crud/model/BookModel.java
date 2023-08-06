package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Table(name="booksInfoTable")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookModel {
	
	 @Id
	 @SequenceGenerator(name= "CLIENT_SEQUENCE", sequenceName = "CLIENT_SEQUENCE_ID", initialValue=1, allocationSize = 1)
	 @GeneratedValue(strategy = GenerationType.AUTO, generator="CLIENT_SEQUENCE")
	private Long id;
	private String bookName;
	private String bookPrice;
	private String bookRating; 
	private String bookCategory;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookRating() {
		return bookRating;
	}
	public void setBookRating(String bookRating) {
		this.bookRating = bookRating;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	} 
	
	
	

	
	
	

}
