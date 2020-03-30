// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VirtualNetworkRule model.
 */
@Fluent
public final class VirtualNetworkRule {
    /*
     * Resource ID of a subnet, for example:
     * /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     */
    @JsonProperty(value = "id", required = true)
    private String virtualNetworkResourceId;

    /*
     * The action of virtual network rule.
     */
    @JsonProperty(value = "action")
    private Action action;

    /*
     * Gets the state of virtual network rule.
     */
    @JsonProperty(value = "state")
    private State state;

    /**
     * Get the virtualNetworkResourceId property: Resource ID of a subnet, for
     * example:
     * /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     * @return the virtualNetworkResourceId value.
     */
    public String getVirtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    /**
     * Set the virtualNetworkResourceId property: Resource ID of a subnet, for
     * example:
     * /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     * @param virtualNetworkResourceId the virtualNetworkResourceId value to
     * set.
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule setVirtualNetworkResourceId(String virtualNetworkResourceId) {
        this.virtualNetworkResourceId = virtualNetworkResourceId;
        return this;
    }

    /**
     * Get the action property: The action of virtual network rule.
     * 
     * @return the action value.
     */
    public Action getAction() {
        return this.action;
    }

    /**
     * Set the action property: The action of virtual network rule.
     * 
     * @param action the action value to set.
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule setAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Get the state property: Gets the state of virtual network rule.
     * 
     * @return the state value.
     */
    public State getState() {
        return this.state;
    }

    /**
     * Set the state property: Gets the state of virtual network rule.
     * 
     * @param state the state value to set.
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule setState(State state) {
        this.state = state;
        return this;
    }
}
