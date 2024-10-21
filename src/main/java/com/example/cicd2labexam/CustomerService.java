package com.example.cicd2labexam;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {

    private final CustomerRepositry customerRepositry;

    @Autowired
    public CustomerService(CusomerRepository customerRepository) {
        this.customerRepositry = customerRepository;
    }
    public List<customer>getAllCustomers(){
        return.customerRepository.findAll();
    }
    public Optional<Customer>getCustomerById(String id){
        return customerRepository.save(customer);
    }
    public Customer CreateCustomer(Customer customer){
        return customerRepositry.save(customer);

    }
}
