package com.java.ibm.springcrud;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository repo;
	
	
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers(){
	 return	repo.findAll();	
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/test")
	public String test(){
	 return "works";	
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
	public void addCustomers(@RequestBody Customer cust){
	 repo.save(cust);	
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
	public void deleteCustomers(@PathVariable long id){
	 repo.deleteById(id);
	}
	
}
