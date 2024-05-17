package com.ace.hexagonal.adapters.out.repository.mapper;

import com.ace.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.ace.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);



}
