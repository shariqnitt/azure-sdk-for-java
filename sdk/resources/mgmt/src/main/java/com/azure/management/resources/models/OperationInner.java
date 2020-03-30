// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.resources.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Operation model.
 */
@Fluent
public final class OperationInner {
    /*
     * Operation name: {provider}/{resource}/{operation}
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The object that represents the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * Get the name property: Operation name:
     * {provider}/{resource}/{operation}.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Operation name:
     * {provider}/{resource}/{operation}.
     * 
     * @param name the name value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The object that represents the operation.
     * 
     * @return the display value.
     */
    public OperationDisplay getDisplay() {
        return this.display;
    }

    /**
     * Set the display property: The object that represents the operation.
     * 
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner setDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }
}
