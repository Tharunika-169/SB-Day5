package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")
public class BookEntity {
	@Id
	private int id;
	private String bookname;
	private float price;
	private int quantity;
	private String autname;
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookEntity(int id, String bookname, float price, int quantity, String autname) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.price = price;
		this.quantity = quantity;
		this.autname = autname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAutname() {
		return autname;
	}
	public void setAutname(String autname) {
		this.autname = autname;
	}
	

}
