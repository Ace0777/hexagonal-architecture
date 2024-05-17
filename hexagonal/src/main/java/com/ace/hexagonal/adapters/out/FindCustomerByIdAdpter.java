package com.ace.hexagonal.adapters.out;

import com.ace.hexagonal.adapters.out.repository.CustomerRepository;
import com.ace.hexagonal.application.core.domain.Customer;
import com.ace.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdpter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Optional<Customer> find(String id) {

    }
}
