// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.management.sql.MetricAvailability;
import com.azure.management.sql.MetricName;
import com.azure.management.sql.PrimaryAggregationType;
import com.azure.management.sql.UnitDefinitionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The MetricDefinition model.
 */
@Immutable
public final class MetricDefinitionInner {
    /*
     * The name information for the metric.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private MetricName name;

    /*
     * The primary aggregation type defining how metric values are displayed.
     */
    @JsonProperty(value = "primaryAggregationType", access = JsonProperty.Access.WRITE_ONLY)
    private PrimaryAggregationType primaryAggregationType;

    /*
     * The resource uri of the database.
     */
    @JsonProperty(value = "resourceUri", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceUri;

    /*
     * The unit of the metric.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private UnitDefinitionType unit;

    /*
     * The list of database metric availabilities for the metric.
     */
    @JsonProperty(value = "metricAvailabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<MetricAvailability> metricAvailabilities;

    /**
     * Get the name property: The name information for the metric.
     * 
     * @return the name value.
     */
    public MetricName name() {
        return this.name;
    }

    /**
     * Get the primaryAggregationType property: The primary aggregation type
     * defining how metric values are displayed.
     * 
     * @return the primaryAggregationType value.
     */
    public PrimaryAggregationType primaryAggregationType() {
        return this.primaryAggregationType;
    }

    /**
     * Get the resourceUri property: The resource uri of the database.
     * 
     * @return the resourceUri value.
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Get the unit property: The unit of the metric.
     * 
     * @return the unit value.
     */
    public UnitDefinitionType unit() {
        return this.unit;
    }

    /**
     * Get the metricAvailabilities property: The list of database metric
     * availabilities for the metric.
     * 
     * @return the metricAvailabilities value.
     */
    public List<MetricAvailability> metricAvailabilities() {
        return this.metricAvailabilities;
    }
}
