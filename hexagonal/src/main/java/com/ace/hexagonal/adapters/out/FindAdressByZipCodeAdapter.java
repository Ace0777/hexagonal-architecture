package com.ace.hexagonal.adapters.out;

import com.ace.hexagonal.adapters.out.client.FindAdressByZipCodeClient;
import com.ace.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.ace.hexagonal.application.core.domain.Address;
import com.ace.hexagonal.application.ports.out.FindAdressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAdressByZipCodeAdapter implements FindAdressByZipCodeOutputPort {

    @Autowired
    private FindAdressByZipCodeClient findAdressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAdressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAdrress(addressResponse);
    }
}
