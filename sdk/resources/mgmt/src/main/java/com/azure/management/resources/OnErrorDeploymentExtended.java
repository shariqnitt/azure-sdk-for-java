// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OnErrorDeploymentExtended model.
 */
@Fluent
public final class OnErrorDeploymentExtended {
    /*
     * The state of the provisioning for the on error deployment.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The deployment on error behavior type. Possible values are
     * LastSuccessful and SpecificDeployment.
     */
    @JsonProperty(value = "type")
    private OnErrorDeploymentType type;

    /*
     * The deployment to be used on error case.
     */
    @JsonProperty(value = "deploymentName")
    private String deploymentName;

    /**
     * Get the provisioningState property: The state of the provisioning for
     * the on error deployment.
     * 
     * @return the provisioningState value.
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the type property: The deployment on error behavior type. Possible
     * values are LastSuccessful and SpecificDeployment.
     * 
     * @return the type value.
     */
    public OnErrorDeploymentType getType() {
        return this.type;
    }

    /**
     * Set the type property: The deployment on error behavior type. Possible
     * values are LastSuccessful and SpecificDeployment.
     * 
     * @param type the type value to set.
     * @return the OnErrorDeploymentExtended object itself.
     */
    public OnErrorDeploymentExtended setType(OnErrorDeploymentType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the deploymentName property: The deployment to be used on error
     * case.
     * 
     * @return the deploymentName value.
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * Set the deploymentName property: The deployment to be used on error
     * case.
     * 
     * @param deploymentName the deploymentName value to set.
     * @return the OnErrorDeploymentExtended object itself.
     */
    public OnErrorDeploymentExtended setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }
}
