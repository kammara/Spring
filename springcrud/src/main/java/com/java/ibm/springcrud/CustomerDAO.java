package com.java.ibm.springcrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDAO {
    
	@Autowired
	CustomerRepository custrepo;
	
	public Customer save(Customer cust) {
		return custrepo.save(cust);
	}
	
	public List<Customer> findAll(){
		return custrepo.findAll();
	}
	
    public void delete(Customer cust) {
		custrepo.delete(cust);
	}
}
