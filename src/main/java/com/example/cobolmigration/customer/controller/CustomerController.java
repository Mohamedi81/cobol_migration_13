package com.example.cobolmigration.customer.controller;

import com.example.cobolmigration.customer.dto.CustomerDto;
import com.example.cobolmigration.customer.dto.CustomerSearchRequest;
import com.example.cobolmigration.customer.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    public Page<CustomerDto> search(
            @RequestParam(required = false) Long customerNumber,
            @RequestParam(required = false) String surname,
            @RequestParam(required = false) String postcode,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dob,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        CustomerSearchRequest request = new CustomerSearchRequest(
                customerNumber, surname, postcode, dob, page, size
        );
        return service.searchCustomers(request);
    }

    @GetMapping("/{id}")
    public CustomerDto get(@PathVariable Long id) {
        return service.getCustomer(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDto create(@RequestBody CustomerDto dto) {
        return service.createCustomer(dto);
    }

    @PutMapping("/{id}")
    public CustomerDto update(@PathVariable Long id, @RequestBody CustomerDto dto) {
        return service.updateCustomer(id, dto);
    }
}
