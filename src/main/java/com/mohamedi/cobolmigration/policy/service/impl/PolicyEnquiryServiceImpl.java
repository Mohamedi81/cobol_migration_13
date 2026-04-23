package com.mohamedi.cobolmigration.policy.service.impl;

import com.mohamedi.cobolmigration.policy.dto.PolicyDetailDto;
import com.mohamedi.cobolmigration.policy.service.PolicyEnquiryService;
import org.springframework.stereotype.Service;

// TODO CM-70: Implement logic equivalent to lgapol01.cbl / lgapdb01.cbl
@Service
public class PolicyEnquiryServiceImpl implements PolicyEnquiryService {
    @Override
    public PolicyDetailDto findByPolicyNumber(String policyNumber) {
        // stub
        return null;
    }
}
