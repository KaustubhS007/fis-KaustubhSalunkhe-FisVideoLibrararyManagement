package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerDao;
import com.example.model.Customer;

@Service
public class CustomerServiceImpl  implements CustomerService{
	
	@Autowired 
	CustomerDao cdao;

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

}
