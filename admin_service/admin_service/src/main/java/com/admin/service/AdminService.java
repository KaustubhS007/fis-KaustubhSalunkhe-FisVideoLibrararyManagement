package com.admin.service;

import java.util.List;

import com.admin.entity.Admin;

public interface AdminService {
public Admin addAdmin(Admin a);
public List<Admin> getAllMovie();
public Admin updateMovie(Admin a);
public String deleteMovie(int id);
public List<Admin> searchByMovieType(String movie_type);

}
