package com.ace.hexagonal.adapters.out.client.mapper;


import com.ace.hexagonal.adapters.out.client.response.AddressResponse;
import com.ace.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAdrress(AddressResponse addressResponse);
}
