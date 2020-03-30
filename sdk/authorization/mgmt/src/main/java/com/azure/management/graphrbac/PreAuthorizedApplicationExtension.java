// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PreAuthorizedApplicationExtension model.
 */
@Fluent
public final class PreAuthorizedApplicationExtension {
    /*
     * The extension's conditions.
     */
    @JsonProperty(value = "conditions")
    private List<String> conditions;

    /**
     * Get the conditions property: The extension's conditions.
     * 
     * @return the conditions value.
     */
    public List<String> getConditions() {
        return this.conditions;
    }

    /**
     * Set the conditions property: The extension's conditions.
     * 
     * @param conditions the conditions value to set.
     * @return the PreAuthorizedApplicationExtension object itself.
     */
    public PreAuthorizedApplicationExtension setConditions(List<String> conditions) {
        this.conditions = conditions;
        return this;
    }
}
