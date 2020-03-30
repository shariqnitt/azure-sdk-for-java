// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SiteAvailabilityState.
 */
public enum SiteAvailabilityState {
    /**
     * Enum value Normal.
     */
    NORMAL("Normal"),

    /**
     * Enum value Limited.
     */
    LIMITED("Limited"),

    /**
     * Enum value DisasterRecoveryMode.
     */
    DISASTER_RECOVERY_MODE("DisasterRecoveryMode");

    /**
     * The actual serialized value for a SiteAvailabilityState instance.
     */
    private final String value;

    SiteAvailabilityState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SiteAvailabilityState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed SiteAvailabilityState object, or null if unable to parse.
     */
    @JsonCreator
    public static SiteAvailabilityState fromString(String value) {
        SiteAvailabilityState[] items = SiteAvailabilityState.values();
        for (SiteAvailabilityState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
