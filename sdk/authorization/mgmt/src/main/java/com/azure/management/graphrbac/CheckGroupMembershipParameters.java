// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The CheckGroupMembershipParameters model.
 */
@Fluent
public final class CheckGroupMembershipParameters {
    /*
     * The object ID of the group to check.
     */
    @JsonProperty(value = "groupId", required = true)
    private String groupId;

    /*
     * The object ID of the contact, group, user, or service principal to check
     * for membership in the specified group.
     */
    @JsonProperty(value = "memberId", required = true)
    private String memberId;

    /*
     * Request parameters for IsMemberOf API call.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Get the groupId property: The object ID of the group to check.
     * 
     * @return the groupId value.
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The object ID of the group to check.
     * 
     * @param groupId the groupId value to set.
     * @return the CheckGroupMembershipParameters object itself.
     */
    public CheckGroupMembershipParameters setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the memberId property: The object ID of the contact, group, user, or
     * service principal to check for membership in the specified group.
     * 
     * @return the memberId value.
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * Set the memberId property: The object ID of the contact, group, user, or
     * service principal to check for membership in the specified group.
     * 
     * @param memberId the memberId value to set.
     * @return the CheckGroupMembershipParameters object itself.
     */
    public CheckGroupMembershipParameters setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * Get the additionalProperties property: Request parameters for IsMemberOf
     * API call.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Request parameters for IsMemberOf
     * API call.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the CheckGroupMembershipParameters object itself.
     */
    public CheckGroupMembershipParameters setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }
}
