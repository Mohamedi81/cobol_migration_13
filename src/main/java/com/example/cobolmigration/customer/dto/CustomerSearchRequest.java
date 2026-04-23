package com.example.cobolmigration.customer.dto;

import java.time.LocalDate;

public record CustomerSearchRequest(
        Long customerNumber,
        String surname,
        String postcode,
        LocalDate dateOfBirth,
        int page,
        int size
) {}
