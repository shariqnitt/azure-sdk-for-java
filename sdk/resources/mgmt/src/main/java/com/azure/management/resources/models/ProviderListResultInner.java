// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ProviderListResult model.
 */
@Fluent
public final class ProviderListResultInner {
    /*
     * An array of resource providers.
     */
    @JsonProperty(value = "value")
    private List<ProviderInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: An array of resource providers.
     * 
     * @return the value value.
     */
    public List<ProviderInner> getValue() {
        return this.value;
    }

    /**
     * Set the value property: An array of resource providers.
     * 
     * @param value the value value to set.
     * @return the ProviderListResultInner object itself.
     */
    public ProviderListResultInner setValue(List<ProviderInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of
     * results.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
