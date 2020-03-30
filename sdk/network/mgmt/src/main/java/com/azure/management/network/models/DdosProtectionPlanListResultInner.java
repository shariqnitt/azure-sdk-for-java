// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The DdosProtectionPlanListResult model.
 */
@Fluent
public final class DdosProtectionPlanListResultInner {
    /*
     * A list of DDoS protection plans.
     */
    @JsonProperty(value = "value")
    private List<DdosProtectionPlanInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: A list of DDoS protection plans.
     * 
     * @return the value value.
     */
    public List<DdosProtectionPlanInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of DDoS protection plans.
     * 
     * @param value the value value to set.
     * @return the DdosProtectionPlanListResultInner object itself.
     */
    public DdosProtectionPlanListResultInner withValue(List<DdosProtectionPlanInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }
}
