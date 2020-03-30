// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.management.compute.LogAnalyticsOutput;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LogAnalyticsOperationResult model.
 */
@Immutable
public final class LogAnalyticsOperationResultInner {
    /*
     * LogAnalytics output properties
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private LogAnalyticsOutput properties;

    /**
     * Get the properties property: LogAnalytics output properties.
     * 
     * @return the properties value.
     */
    public LogAnalyticsOutput properties() {
        return this.properties;
    }
}
