package com.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.admin.entity.Admin;
@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer>{

	@Query("select a from Admin a where a.movie_type=?1")
	public List<Admin> searchByMovieType(String movie_type);
}
