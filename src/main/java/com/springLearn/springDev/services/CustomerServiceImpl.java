package com.springLearn.springDev.services;

import com.springLearn.springDev.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerDetails(UUID cID) {
        return CustomerDTO.builder().customerName("Dinesh Ashok S").customerEmail("dineshashok30@gmail.com").mobileNumber("1283829911").build();
    }

    @Override
    public CustomerDTO addNewCustomer(CustomerDTO customerDTO) {
        return CustomerDTO.builder().customerName(customerDTO.getCustomerName()).customerEmail(customerDTO.getCustomerEmail()).build();
    }

    @Override
    public void updateCustomer(UUID cID, CustomerDTO customerDTO) {
        //update customer occured here
    }

    @Override
    public void deleteCustomer(UUID cID) {
        log.debug("Delete operation completed...");
    }
}
