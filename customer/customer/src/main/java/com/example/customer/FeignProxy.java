package com.example.customer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "adminservice")
public interface FeignProxy {

	@GetMapping("admin/search/{movietype}")
	public List<AdminDto> searchByMovieType(@PathVariable("movietype") String movie_type);
}
