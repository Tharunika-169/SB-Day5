package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BookEntity;

public interface Bookrepo extends JpaRepository<BookEntity, Integer> {

}
