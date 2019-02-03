package com.jpsite.production.customer;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpsite.production.customer.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}