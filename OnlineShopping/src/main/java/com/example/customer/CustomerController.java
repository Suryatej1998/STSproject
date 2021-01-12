package com.example.customer;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerController {
	@Autowired
	public Customerservice customerservice;
	
	@PostMapping("/Customerinsert")
	public Map insertCustomer(@RequestBody Customer customer) {
		Map addcustomer = null;
				try {
			addcustomer = customerservice.insertCustomer(customer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				return addcustomer;
	}
	@CrossOrigin
	@PutMapping("/update")
	public Map update(@RequestBody Customer customer) {
		return customerservice.update(customer);
	}

	
	@CrossOrigin
	@GetMapping("/get")
	public List get(@RequestBody Customer customer) {
		return customerservice.get(customer.getCustomerid());
	}

	@CrossOrigin
	@GetMapping("/getAll")
	public List getAll() {
		return customerservice.getAll();
	}

	}
