package com.mohamedi.cobolmigration.integration.dto;

// CM-77: from soaipb1.cpy / soaiph1.cpy
public class PolicyDetailRequestEnvelope {
    private String policyNumber;
    private String correlationId;
    private String channel;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
