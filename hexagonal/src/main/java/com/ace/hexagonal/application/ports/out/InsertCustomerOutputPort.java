package com.ace.hexagonal.application.ports.out;

import com.ace.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
