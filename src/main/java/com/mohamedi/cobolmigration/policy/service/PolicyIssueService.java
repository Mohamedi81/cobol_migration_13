package com.mohamedi.cobolmigration.policy.service;

import com.mohamedi.cobolmigration.policy.dto.PolicyDetailDto;
import com.mohamedi.cobolmigration.policy.dto.PolicyIssueRequest;

// CM-73
public interface PolicyIssueService {
    PolicyDetailDto issuePolicy(PolicyIssueRequest request);
}
