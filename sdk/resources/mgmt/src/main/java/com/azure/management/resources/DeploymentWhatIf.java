// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DeploymentWhatIf model.
 */
@Fluent
public final class DeploymentWhatIf {
    /*
     * The location to store the deployment data.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The deployment properties.
     */
    @JsonProperty(value = "properties", required = true)
    private DeploymentWhatIfProperties properties;

    /**
     * Get the location property: The location to store the deployment data.
     * 
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location to store the deployment data.
     * 
     * @param location the location value to set.
     * @return the DeploymentWhatIf object itself.
     */
    public DeploymentWhatIf setLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the properties property: The deployment properties.
     * 
     * @return the properties value.
     */
    public DeploymentWhatIfProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The deployment properties.
     * 
     * @param properties the properties value to set.
     * @return the DeploymentWhatIf object itself.
     */
    public DeploymentWhatIf setProperties(DeploymentWhatIfProperties properties) {
        this.properties = properties;
        return this;
    }
}
