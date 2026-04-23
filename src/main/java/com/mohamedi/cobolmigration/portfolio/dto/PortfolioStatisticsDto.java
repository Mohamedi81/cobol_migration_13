package com.mohamedi.cobolmigration.portfolio.dto;

// CM-76: Portfolio statistics based on lgastat1.cbl
public class PortfolioStatisticsDto {
    private long customerCount;
    private long livePolicyCount;
    private long lapsedPolicyCount;
    private long cancelledPolicyCount;

    public long getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(long customerCount) {
        this.customerCount = customerCount;
    }

    public long getLivePolicyCount() {
        return livePolicyCount;
    }

    public void setLivePolicyCount(long livePolicyCount) {
        this.livePolicyCount = livePolicyCount;
    }

    public long getLapsedPolicyCount() {
        return lapsedPolicyCount;
    }

    public void setLapsedPolicyCount(long lapsedPolicyCount) {
        this.lapsedPolicyCount = lapsedPolicyCount;
    }

    public long getCancelledPolicyCount() {
        return cancelledPolicyCount;
    }

    public void setCancelledPolicyCount(long cancelledPolicyCount) {
        this.cancelledPolicyCount = cancelledPolicyCount;
    }
}
