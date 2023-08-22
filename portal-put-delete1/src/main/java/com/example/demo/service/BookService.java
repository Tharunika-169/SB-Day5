package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookEntity;
import com.example.demo.repository.Bookrepo;

@Service
public class BookService {

	@Autowired
	Bookrepo br;
	
	public BookEntity saveinfo (BookEntity ss)
	{
		return br.save(ss);
	}

	public List<BookEntity> showinfo()
	{
		return br.findAll();
	}
	
	public BookEntity changeinfo(BookEntity ss)
	{
		return br.saveAndFlush(ss);
	}
	
	public void deleteinfo(BookEntity ss)
	{
		br.delete(ss);
	}
}
