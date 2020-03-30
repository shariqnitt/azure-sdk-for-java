// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.management.network.AuthorizationUseStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ExpressRouteCircuitAuthorization model.
 */
@JsonFlatten
@Fluent
public class ExpressRouteCircuitAuthorizationInner extends SubResource {
    /*
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The authorization key.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /*
     * The authorization use status.
     */
    @JsonProperty(value = "properties.authorizationUseStatus")
    private AuthorizationUseStatus authorizationUseStatus;

    /*
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: Gets name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the authorizationKey property: The authorization key.
     * 
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: The authorization key.
     * 
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the authorizationUseStatus property: The authorization use status.
     * 
     * @return the authorizationUseStatus value.
     */
    public AuthorizationUseStatus authorizationUseStatus() {
        return this.authorizationUseStatus;
    }

    /**
     * Set the authorizationUseStatus property: The authorization use status.
     * 
     * @param authorizationUseStatus the authorizationUseStatus value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withAuthorizationUseStatus(AuthorizationUseStatus authorizationUseStatus) {
        this.authorizationUseStatus = authorizationUseStatus;
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the
     * public IP resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Gets the provisioning state of the
     * public IP resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }
}
