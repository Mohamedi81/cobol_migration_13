package com.example.cobolmigration.customer.repository;

import com.example.cobolmigration.customer.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Page<Customer> findBySurnameStartsWithIgnoreCaseAndPostcode(
            String surnamePrefix,
            String postcode,
            Pageable pageable
    );
}
