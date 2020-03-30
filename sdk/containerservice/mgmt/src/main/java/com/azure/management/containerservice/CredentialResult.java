// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CredentialResult model.
 */
@Immutable
public final class CredentialResult {
    /*
     * The name of the credential.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Base64-encoded Kubernetes configuration file.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private byte[] value;

    /**
     * Get the name property: The name of the credential.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value property: Base64-encoded Kubernetes configuration file.
     * 
     * @return the value value.
     */
    public byte[] value() {
        return CoreUtils.clone(this.value);
    }
}
