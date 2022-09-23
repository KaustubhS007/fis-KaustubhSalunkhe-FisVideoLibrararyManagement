package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired 
	private CustomerService  cust;
//	@Autowired 
//	private CustomerService cust1;
	@GetMapping("/getAll")

	public List<Customer> getAllDetails()
	{
		return this.cust.getAllCustomers();
	}
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer c)
	{
		return this.cust.addCustomer(c);
		
	}
	@PutMapping("/update")
	public Customer updatingMovie(@RequestBody Customer c)

	{
		return this.cust.updateCustomer(c);
		
	}
	@GetMapping("/admin/search/{movietype}")
	public List<AdminDto> searchByMovieType(@PathVariable("movietype") String movie_type){
		return this.cust.findmovie_type(movie_type);
	}

}
