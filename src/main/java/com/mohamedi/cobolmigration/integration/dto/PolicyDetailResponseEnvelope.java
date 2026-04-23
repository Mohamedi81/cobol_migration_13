package com.mohamedi.cobolmigration.integration.dto;

// CM-77: from soaipe1.cpy / soaipm1.cpy
public class PolicyDetailResponseEnvelope {
    private String correlationId;
    private String statusCode;
    private String statusMessage;
    private Object policyDetails; // or typed DTO

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public Object getPolicyDetails() {
        return policyDetails;
    }

    public void setPolicyDetails(Object policyDetails) {
        this.policyDetails = policyDetails;
    }
}
