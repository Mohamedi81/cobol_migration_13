package com.mohamedi.cobolmigration.policy.dto;

// TODO CM-70: Align with COBOL lgcmarea.cpy/lgpolicy.cpy
public class PolicyDetailDto {
    private String policyNumber;
    private String status;
    private String productCode;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
