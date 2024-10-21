package com.example.cicd2labexam;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService();

    }

    @GetMapping
    public List<Customers> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer>getCustomerById(@PathVariable String id){
        Optional<Customer>customer = customerService.getCustomerById(id);
        return customer.map(ResponseEntity::ok).orElseGet())->ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@Validated @RequestBody Customer customer) {
        return Response.Entity.ok(customerService.createCustomer(customer));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Customer>updateCustomer(@PathVariable String id, @Validated @RequestBody Customer customer) {
        Optional<Customer> existingCustomer = customerService.getCustomerById(id);

        if (existingCustomer.isPresent()) {
            Customer.setId(id);
            Customer updated = customerService.updateCustomer(customer);
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.notFound().build();
    }
}