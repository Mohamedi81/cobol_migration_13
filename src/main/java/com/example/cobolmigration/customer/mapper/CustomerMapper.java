package com.example.cobolmigration.customer.mapper;

import com.example.cobolmigration.customer.domain.Customer;
import com.example.cobolmigration.customer.dto.CustomerDto;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerDto toDto(Customer customer) {
        return new CustomerDto(
                customer.getId(),
                customer.getTitle(),
                customer.getInitials(),
                customer.getSurname(),
                customer.getFirstName(),
                customer.getAddressLine1(),
                customer.getAddressLine2(),
                customer.getAddressLine3(),
                customer.getTown(),
                customer.getCounty(),
                customer.getPostcode(),
                customer.getCountry(),
                customer.getDateOfBirth(),
                customer.getPhoneHome(),
                customer.getPhoneMobile(),
                customer.getEmail(),
                customer.getMarketingConsent()
        );
    }

    public Customer toEntity(CustomerDto dto) {
        Customer customer = new Customer();
        customer.setId(dto.id());
        customer.setTitle(dto.title());
        customer.setInitials(dto.initials());
        customer.setSurname(dto.surname());
        customer.setFirstName(dto.firstName());
        customer.setAddressLine1(dto.addressLine1());
        customer.setAddressLine2(dto.addressLine2());
        customer.setAddressLine3(dto.addressLine3());
        customer.setTown(dto.town());
        customer.setCounty(dto.county());
        customer.setPostcode(dto.postcode());
        customer.setCountry(dto.country());
        customer.setDateOfBirth(dto.dateOfBirth());
        customer.setPhoneHome(dto.phoneHome());
        customer.setPhoneMobile(dto.phoneMobile());
        customer.setEmail(dto.email());
        customer.setMarketingConsent(dto.marketingConsent());
        return customer;
    }

    public void updateEntity(Customer existing, CustomerDto dto) {
        existing.setTitle(dto.title());
        existing.setInitials(dto.initials());
        existing.setSurname(dto.surname());
        existing.setFirstName(dto.firstName());
        existing.setAddressLine1(dto.addressLine1());
        existing.setAddressLine2(dto.addressLine2());
        existing.setAddressLine3(dto.addressLine3());
        existing.setTown(dto.town());
        existing.setCounty(dto.county());
        existing.setPostcode(dto.postcode());
        existing.setCountry(dto.country());
        existing.setDateOfBirth(dto.dateOfBirth());
        existing.setPhoneHome(dto.phoneHome());
        existing.setPhoneMobile(dto.phoneMobile());
        existing.setEmail(dto.email());
        existing.setMarketingConsent(dto.marketingConsent());
    }
}
