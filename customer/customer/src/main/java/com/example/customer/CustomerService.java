package com.example.customer;

import java.util.List;




public interface CustomerService {

	public Customer addCustomer(Customer c);
	public List<Customer> getAllCustomers();
	public Customer  updateCustomer(Customer c);
	
	public List<AdminDto> findmovie_type(String movie_type);
}
