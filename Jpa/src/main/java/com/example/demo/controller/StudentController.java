package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService sser;
	
	@PostMapping("addstudent")
	public StudentEntity add(@RequestBody StudentEntity ss)
	{
		return sser.saveinfo(ss);
	}
	
	//array of values
	@PostMapping("addnstudent")
	
		public List<StudentEntity> addndetails (@RequestBody List<StudentEntity> ss)
		{
		  return sser.savedetails(ss);
	}
	
	@GetMapping("showdetails")
	public List<StudentEntity> show()
	{
		return sser.showinfo();
	}
	
	@PutMapping("update")
	public StudentEntity modify(@RequestBody StudentEntity ss)
	{
		return sser.changeinfo(ss);
	}
	
	@DeleteMapping("deletedetail")
	public String del(@RequestBody StudentEntity ss)
	{
		sser.deleteinfo(ss);
		return "Deleted successfully";
	}
	
	//@pathvariable - to access unique elements
	
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id)  //pathvariable -> to extact the information
	{
		sser.deleteid(id);
	}
	
	@DeleteMapping("delparamid")
	public void deletemyparamid(@RequestParam int id)
	{
		sser.deletepid(id);
	}

}
