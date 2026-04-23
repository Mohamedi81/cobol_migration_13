package com.mohamedi.cobolmigration.policy.dto;

// TODO CM-74/CM-75: Extend for specific amendment types
public class PolicyAmendRequest {
    private String actionType; // e.g. "AMEND", "CANCEL"

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
}
