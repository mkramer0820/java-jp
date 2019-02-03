package com.jpsite.production.customer;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jpsite.production.customer.Customer;
import com.jpsite.production.customer.CustomerRepository;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;


//@RestController
@Controller    // This means that this class is a Controller
@RequestMapping(path="/customers")// This means URL's start with /customer (after Application path)
public class CustomerController {
	
	@Autowired // This means to get the bean called customerRepository
	private CustomerRepository customerRepository;
	
    //@ResponseBody // means the returned String is the response, not a view name
	//@request mean param from get or post request

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewCustomer (@RequestParam String name) {

		Customer n = new Customer();
		n.setName(name);
		customerRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Customer> getAllCustomers() {
		// This returns a JSON or XML with the users
		return customerRepository.findAll();
	}

	
}