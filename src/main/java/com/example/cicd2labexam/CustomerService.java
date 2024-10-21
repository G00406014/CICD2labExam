package com.example.cicd2labexam;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {

    private final CustomerRepositry customerRepositry;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<customer>getAllCustomers(){
        return.CustomerRepository.findAll();
    }
    public Optional<customer>getCustomerById(String id){
        return CustomerRepository.save(customer);
    }
    public customer CreateCustomer(customer customer){
        return customerRepositry.save(customer);

    }
}
