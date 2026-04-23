package com.mohamedi.cobolmigration.policy.service.impl;

import com.mohamedi.cobolmigration.policy.dto.PolicyAmendRequest;
import com.mohamedi.cobolmigration.policy.dto.PolicyDetailDto;
import com.mohamedi.cobolmigration.policy.service.PolicyAmendService;
import org.springframework.stereotype.Service;

// TODO CM-74/CM-75: Implement logic equivalent to lgupol01.cbl / lgupdb01.cbl
@Service
public class PolicyAmendServiceImpl implements PolicyAmendService {
    @Override
    public PolicyDetailDto amendPolicy(String policyNumber, PolicyAmendRequest request) {
        // stub
        return null;
    }
}
