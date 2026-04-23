package com.mohamedi.cobolmigration.policy;

import com.mohamedi.cobolmigration.policy.dto.PolicyAmendRequest;
import com.mohamedi.cobolmigration.policy.dto.PolicyDetailDto;
import com.mohamedi.cobolmigration.policy.dto.PolicyIssueRequest;
import com.mohamedi.cobolmigration.policy.service.PolicyAmendService;
import com.mohamedi.cobolmigration.policy.service.PolicyEnquiryService;
import com.mohamedi.cobolmigration.policy.service.PolicyIssueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// CM-70, CM-73, CM-74, CM-75
@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    private final PolicyEnquiryService enquiryService;
    private final PolicyIssueService issueService;
    private final PolicyAmendService amendService;

    public PolicyController(PolicyEnquiryService enquiryService,
                            PolicyIssueService issueService,
                            PolicyAmendService amendService) {
        this.enquiryService = enquiryService;
        this.issueService = issueService;
        this.amendService = amendService;
    }

    // CM-70
    @GetMapping("/{policyNumber}")
    public ResponseEntity<PolicyDetailDto> getPolicy(@PathVariable String policyNumber) {
        // TODO CM-70: Implement using PolicyEnquiryService
        return ResponseEntity.notFound().build();
    }

    // CM-73
    @PostMapping
    public ResponseEntity<PolicyDetailDto> issuePolicy(@RequestBody PolicyIssueRequest request) {
        // TODO CM-73
        return ResponseEntity.badRequest().build();
    }

    // CM-74
    @PutMapping("/{policyNumber}")
    public ResponseEntity<PolicyDetailDto> amendPolicy(
            @PathVariable String policyNumber,
            @RequestBody PolicyAmendRequest request) {
        // TODO CM-74
        return ResponseEntity.badRequest().build();
    }

    // CM-75 (cancel as special action)
    @PostMapping("/{policyNumber}/cancellations")
    public ResponseEntity<PolicyDetailDto> cancelPolicy(
            @PathVariable String policyNumber,
            @RequestBody PolicyAmendRequest request) {
        // TODO CM-75: set actionType="CANCEL" and delegate to amend service
        return ResponseEntity.badRequest().build();
    }
}
