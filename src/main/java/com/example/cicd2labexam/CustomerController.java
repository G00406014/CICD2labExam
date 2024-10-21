package com.example.cicd2labexam;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@ControllerAdvice
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService();

    }

    @GetMapping
    public List<customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<customer>getCustomerById(@PathVariable String id){
        Optional<customer>customer = customerService.getCustomerById(id);
        return customer.map(ResponseEntity::ok).orElseGet())->ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<customer> createCustomer(@Validated @RequestBody customer customer) {
        return Response.Entity.ok(customerService.createCustomer(customer));
    }
    @PutMapping("/{id}")
    public ResponseEntity<customer>updateCustomer(@PathVariable String id, @Validated @RequestBody customer customer) {
        Optional<com.example.cicd2labexam.customer> existingCustomer = customerService.getCustomerById(id);

        if (existingCustomer.isPresent()) {
            com.example.cicd2labexam.customer.setId(id);
            com.example.cicd2labexam.customer updated = customerService.updateCustomer(customer);
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.notFound().build();
    }
}