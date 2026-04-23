package com.mohamedi.cobolmigration.integration;

import com.mohamedi.cobolmigration.integration.dto.PolicyDetailRequestEnvelope;
import com.mohamedi.cobolmigration.integration.dto.PolicyDetailResponseEnvelope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// CM-77
@RestController
@RequestMapping("/api/soa/policies")
public class PolicyIntegrationController {

    // TODO CM-77: Inject PolicyEnquiryService via Policy Service or REST client

    @PostMapping("/details")
    public ResponseEntity<PolicyDetailResponseEnvelope> getPolicyDetails(
            @RequestBody PolicyDetailRequestEnvelope request) {
        // TODO CM-77: call internal PolicyEnquiryService, map to SOA envelope
        PolicyDetailResponseEnvelope response = new PolicyDetailResponseEnvelope();
        return ResponseEntity.ok(response);
    }
}
