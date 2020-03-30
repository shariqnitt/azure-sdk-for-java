// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.annotation.Immutable;
import com.azure.management.storage.Reason;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CheckNameAvailabilityResult model.
 */
@Immutable
public final class CheckNameAvailabilityResultInner {
    /*
     * Gets a boolean value that indicates whether the name is available for
     * you to use. If true, the name is available. If false, the name has
     * already been taken or is invalid and cannot be used.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /*
     * Gets the reason that a storage account name could not be used. The
     * Reason element is only returned if NameAvailable is false.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private Reason reason;

    /*
     * Gets an error message explaining the Reason value in more detail.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get the nameAvailable property: Gets a boolean value that indicates
     * whether the name is available for you to use. If true, the name is
     * available. If false, the name has already been taken or is invalid and
     * cannot be used.
     * 
     * @return the nameAvailable value.
     */
    public Boolean isNameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get the reason property: Gets the reason that a storage account name
     * could not be used. The Reason element is only returned if NameAvailable
     * is false.
     * 
     * @return the reason value.
     */
    public Reason getReason() {
        return this.reason;
    }

    /**
     * Get the message property: Gets an error message explaining the Reason
     * value in more detail.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }
}
