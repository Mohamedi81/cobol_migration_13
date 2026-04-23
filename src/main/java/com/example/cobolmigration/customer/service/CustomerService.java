package com.example.cobolmigration.customer.service;

import com.example.cobolmigration.common.exception.NotFoundException;
import com.example.cobolmigration.customer.domain.Customer;
import com.example.cobolmigration.customer.dto.CustomerDto;
import com.example.cobolmigration.customer.dto.CustomerSearchRequest;
import com.example.cobolmigration.customer.mapper.CustomerMapper;
import com.example.cobolmigration.customer.repository.CustomerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;
    private final CustomerValidator validator;
    private final CustomerMapper mapper;

    public CustomerService(CustomerRepository repository,
                           CustomerValidator validator,
                           CustomerMapper mapper) {
        this.repository = repository;
        this.validator = validator;
        this.mapper = mapper;
    }

    public Page<CustomerDto> searchCustomers(CustomerSearchRequest request) {
        validator.validateSearch(request);

        if (request.customerNumber() != null) {
            Customer customer = repository.findById(request.customerNumber())
                    .orElseThrow(() -> new NotFoundException("Customer not found"));
            return new PageImpl<>(List.of(mapper.toDto(customer)));
        }

        Pageable pageable = PageRequest.of(request.page(), request.size(), Sort.by("surname"));
        Page<Customer> page = repository.findBySurnameStartsWithIgnoreCaseAndPostcode(
                request.surname(), request.postcode(), pageable
        );
        if (page.isEmpty()) {
            throw new NotFoundException("No customers found");
        }
        return page.map(mapper::toDto);
    }

    public CustomerDto getCustomer(Long id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElseThrow(() -> new NotFoundException("Customer not found"));
    }

    public CustomerDto createCustomer(CustomerDto dto) {
        validator.validateCreate(dto);
        Customer entity = mapper.toEntity(dto);
        entity.setId(null);
        entity.setCreatedAt(Instant.now());
        Customer saved = repository.save(entity);
        return mapper.toDto(saved);
    }

    public CustomerDto updateCustomer(Long id, CustomerDto dto) {
        Customer existing = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Customer not found"));
        validator.validateUpdate(dto);

        mapper.updateEntity(existing, dto);
        existing.setUpdatedAt(Instant.now());
        Customer saved = repository.save(existing);
        return mapper.toDto(saved);
    }
}
