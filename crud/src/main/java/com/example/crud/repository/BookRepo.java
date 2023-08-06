package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.model.BookModel;

@Repository
public interface BookRepo extends JpaRepository<BookModel,Long>{

}
