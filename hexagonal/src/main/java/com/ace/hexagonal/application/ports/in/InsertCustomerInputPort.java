package com.ace.hexagonal.application.ports.in;

import com.ace.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
