package com.mohamedi.cobolmigration.policy.service.impl;

import com.mohamedi.cobolmigration.policy.dto.PolicyDetailDto;
import com.mohamedi.cobolmigration.policy.dto.PolicyIssueRequest;
import com.mohamedi.cobolmigration.policy.service.PolicyIssueService;
import org.springframework.stereotype.Service;

// TODO CM-73: Implement logic equivalent to lgipol01.cbl / lgipdb01.cbl
@Service
public class PolicyIssueServiceImpl implements PolicyIssueService {
    @Override
    public PolicyDetailDto issuePolicy(PolicyIssueRequest request) {
        // stub
        return null;
    }
}
