package com.example.cobolmigration.customer.dto;

import java.time.LocalDate;

public record CustomerDto(
        Long id,
        String title,
        String initials,
        String surname,
        String firstName,
        String addressLine1,
        String addressLine2,
        String addressLine3,
        String town,
        String county,
        String postcode,
        String country,
        LocalDate dateOfBirth,
        String phoneHome,
        String phoneMobile,
        String email,
        Boolean marketingConsent
) {}
