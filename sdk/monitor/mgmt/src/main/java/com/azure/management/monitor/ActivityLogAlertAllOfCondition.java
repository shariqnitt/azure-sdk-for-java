// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ActivityLogAlertAllOfCondition model.
 */
@Fluent
public final class ActivityLogAlertAllOfCondition {
    /*
     * The list of activity log alert conditions.
     */
    @JsonProperty(value = "allOf", required = true)
    private List<ActivityLogAlertLeafCondition> allOf;

    /**
     * Get the allOf property: The list of activity log alert conditions.
     * 
     * @return the allOf value.
     */
    public List<ActivityLogAlertLeafCondition> allOf() {
        return this.allOf;
    }

    /**
     * Set the allOf property: The list of activity log alert conditions.
     * 
     * @param allOf the allOf value to set.
     * @return the ActivityLogAlertAllOfCondition object itself.
     */
    public ActivityLogAlertAllOfCondition withAllOf(List<ActivityLogAlertLeafCondition> allOf) {
        this.allOf = allOf;
        return this;
    }
}
