// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NextHopParameters model.
 */
@Fluent
public final class NextHopParameters {
    /*
     * The resource identifier of the target resource against which the action
     * is to be performed.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /*
     * The source IP address.
     */
    @JsonProperty(value = "sourceIPAddress", required = true)
    private String sourceIPAddress;

    /*
     * The destination IP address.
     */
    @JsonProperty(value = "destinationIPAddress", required = true)
    private String destinationIPAddress;

    /*
     * The NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any
     * of the nics, then this parameter must be specified. Otherwise optional).
     */
    @JsonProperty(value = "targetNicResourceId")
    private String targetNicResourceId;

    /**
     * Get the targetResourceId property: The resource identifier of the target
     * resource against which the action is to be performed.
     * 
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The resource identifier of the target
     * resource against which the action is to be performed.
     * 
     * @param targetResourceId the targetResourceId value to set.
     * @return the NextHopParameters object itself.
     */
    public NextHopParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the sourceIPAddress property: The source IP address.
     * 
     * @return the sourceIPAddress value.
     */
    public String sourceIPAddress() {
        return this.sourceIPAddress;
    }

    /**
     * Set the sourceIPAddress property: The source IP address.
     * 
     * @param sourceIPAddress the sourceIPAddress value to set.
     * @return the NextHopParameters object itself.
     */
    public NextHopParameters withSourceIPAddress(String sourceIPAddress) {
        this.sourceIPAddress = sourceIPAddress;
        return this;
    }

    /**
     * Get the destinationIPAddress property: The destination IP address.
     * 
     * @return the destinationIPAddress value.
     */
    public String destinationIPAddress() {
        return this.destinationIPAddress;
    }

    /**
     * Set the destinationIPAddress property: The destination IP address.
     * 
     * @param destinationIPAddress the destinationIPAddress value to set.
     * @return the NextHopParameters object itself.
     */
    public NextHopParameters withDestinationIPAddress(String destinationIPAddress) {
        this.destinationIPAddress = destinationIPAddress;
        return this;
    }

    /**
     * Get the targetNicResourceId property: The NIC ID. (If VM has multiple
     * NICs and IP forwarding is enabled on any of the nics, then this
     * parameter must be specified. Otherwise optional).
     * 
     * @return the targetNicResourceId value.
     */
    public String targetNicResourceId() {
        return this.targetNicResourceId;
    }

    /**
     * Set the targetNicResourceId property: The NIC ID. (If VM has multiple
     * NICs and IP forwarding is enabled on any of the nics, then this
     * parameter must be specified. Otherwise optional).
     * 
     * @param targetNicResourceId the targetNicResourceId value to set.
     * @return the NextHopParameters object itself.
     */
    public NextHopParameters withTargetNicResourceId(String targetNicResourceId) {
        this.targetNicResourceId = targetNicResourceId;
        return this;
    }
}
