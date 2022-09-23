package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl  implements CustomerService{
	
	@Autowired 
	CustomerDao cdao;
	
	@Autowired
	FeignProxy proxy;

	@Override
	public Customer addCustomer(Customer c) {
		// TODO Auto-generated method stub
		return cdao.save(c);
	}

	

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return cdao.findAll();
	}

	@Override
	public Customer updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return cdao.save(c);
	}



	@Override
	public List<AdminDto> findmovie_type(String movie_type) {
		// TODO Auto-generated method stub
		return proxy.searchByMovieType(movie_type);
	}




}
