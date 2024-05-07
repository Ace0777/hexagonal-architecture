package com.ace.hexagonal.application.ports.out;

import com.ace.hexagonal.application.core.domain.Address;

public interface FindAdressByZipCodeOutputPort {

    Address find(String zipCode);
}
