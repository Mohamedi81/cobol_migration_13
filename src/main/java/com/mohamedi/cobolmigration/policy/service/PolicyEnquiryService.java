package com.mohamedi.cobolmigration.policy.service;

import com.mohamedi.cobolmigration.policy.dto.PolicyDetailDto;

// CM-70
public interface PolicyEnquiryService {
    PolicyDetailDto findByPolicyNumber(String policyNumber);
}
