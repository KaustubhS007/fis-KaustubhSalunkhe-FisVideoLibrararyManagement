package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.AdminRepo;
import com.admin.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepo repo;
	@Override
	public Admin addAdmin(Admin a) {
		// TODO Auto-generated method stub
		return this.repo.save(a);
	}
	@Override
	public List<Admin> getAllMovie() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}
	@Override
	public Admin updateMovie(Admin a) {
		// TODO Auto-generated method stub
		return this.repo.save(a);
	}
	@Override
	public String deleteMovie(int id) {
		// TODO Auto-generated method stub
	this.repo.deleteById(id);
	return "Movie deleted";
	}
	@Override
	public List<Admin> searchByMovieType(String movie_type) {
		// TODO Auto-generated method stub
		return repo.searchByMovieType(movie_type);
	}
	

}
