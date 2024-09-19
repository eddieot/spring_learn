package com.springLearn.springDev.services;

import com.springLearn.springDev.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerDetails(UUID cID);
    CustomerDTO addNewCustomer(CustomerDTO customerDTO);
    void updateCustomer(UUID cID, CustomerDTO customerDTO);
    void deleteCustomer(UUID cID);
}
