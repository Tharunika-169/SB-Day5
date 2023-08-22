package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookEntity;
import com.example.demo.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService sser;
	
	@PostMapping("addbook")
	public BookEntity add(@RequestBody BookEntity ss)
	{
		return sser.saveinfo(ss);
	}
	
	@GetMapping("showdetails")
	public List<BookEntity> show()
	{
		return sser.showinfo();
	}
	
	@PutMapping("update")
	public BookEntity modify(@RequestBody BookEntity ss)
	{
		return sser.changeinfo(ss);
	}
	
	@DeleteMapping("deletedetails")
	public String del(@RequestBody BookEntity ss)
	{
		sser.deleteinfo(ss);
		return "Deleted Successfully";
	}
	

}
