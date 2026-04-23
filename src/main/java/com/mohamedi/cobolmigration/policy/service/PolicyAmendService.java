package com.mohamedi.cobolmigration.policy.service;

import com.mohamedi.cobolmigration.policy.dto.PolicyAmendRequest;
import com.mohamedi.cobolmigration.policy.dto.PolicyDetailDto;

// CM-74, CM-75
public interface PolicyAmendService {
    PolicyDetailDto amendPolicy(String policyNumber, PolicyAmendRequest request);
}
