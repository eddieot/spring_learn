package com.springLearn.springDev.web.controller;

import com.springLearn.springDev.services.CustomerService;
import com.springLearn.springDev.web.model.CustomerDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerID}")
    public ResponseEntity<CustomerDTO> getCustomerDetails(@PathVariable("customerID") UUID cID){
        return new ResponseEntity<>(customerService.getCustomerDetails(cID), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpHeaders> addCustomer(@RequestBody CustomerDTO customerDTO){
        CustomerDTO sCustomer = customerService.addNewCustomer(customerDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("apiEndPoint","/api/v1/customer/"+sCustomer.getCustomerName());
        headers.add("message","Customer added Successfully !!");
        return new ResponseEntity<>(headers,HttpStatus.CREATED);
    }

    @PutMapping("/{customerID}")
    public ResponseEntity<HttpHeaders> updateCustomer(@PathVariable("customerID") UUID cID, @RequestBody @Valid CustomerDTO customerDTO){
        customerService.updateCustomer(cID, customerDTO);
        return new ResponseEntity<>(HttpHeaders.EMPTY,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{customerID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("customerID") UUID cID){
        customerService.deleteCustomer(cID);
    }
}
