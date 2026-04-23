package com.example.cobolmigration.customer.service;

import com.example.cobolmigration.customer.dto.CustomerDto;
import com.example.cobolmigration.customer.dto.CustomerSearchRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class CustomerValidator {

    public void validateSearch(CustomerSearchRequest request) {
        if (request.customerNumber() == null) {
            if (!StringUtils.hasText(request.surname()) || !StringUtils.hasText(request.postcode())) {
                throw new IllegalArgumentException("Either customerNumber or (surname and postcode) must be provided");
            }
        }
    }

    public void validateCreate(CustomerDto dto) {
        if (!StringUtils.hasText(dto.initials()) || !StringUtils.hasText(dto.surname()) ||
                !StringUtils.hasText(dto.addressLine1()) || !StringUtils.hasText(dto.town()) ||
                !StringUtils.hasText(dto.postcode()) || !StringUtils.hasText(dto.country()) ||
                dto.dateOfBirth() == null) {
            throw new IllegalArgumentException("Mandatory customer fields are missing");
        }
    }

    public void validateUpdate(CustomerDto dto) {
        // For now reuse create rules; adjust as needed to mimic COBOL update rules
        validateCreate(dto);
    }
}
