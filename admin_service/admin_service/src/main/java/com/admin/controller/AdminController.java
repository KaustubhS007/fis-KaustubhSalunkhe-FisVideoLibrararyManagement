package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.entity.Admin;
import com.admin.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/movie")
	public List<Admin> getAllDetails()
	{
		return this.adminService.getAllMovie();
	}
	
	@PostMapping("/addmovie")
	public Admin addMovie(@RequestBody Admin a)
	{
		return this.adminService.addAdmin(a);
		
	}
	@PutMapping("/updatemovie")
	public Admin updatingMovie(@RequestBody Admin admin)

	{
		return this.adminService.updateMovie(admin);
		
	}
	@DeleteMapping("/delmovie/{mid}")
	public String deletMovie(@PathVariable("mid")int mid)
	{
		return this.adminService.deleteMovie(mid);
	}
	
	@GetMapping("/search/{movietype}")
	public List<Admin> searchByMovieType(@PathVariable("movietype") String movie_type)
	{
		return this.adminService.searchByMovieType(movie_type);
	}
}
