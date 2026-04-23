package com.mohamedi.cobolmigration.policy.dto;

// TODO CM-73: Define fields based on lgipol01 inputs
public class PolicyIssueRequest {
    private String customerRef;
    private String productCode;

    public String getCustomerRef() {
        return customerRef;
    }

    public void setCustomerRef(String customerRef) {
        this.customerRef = customerRef;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
