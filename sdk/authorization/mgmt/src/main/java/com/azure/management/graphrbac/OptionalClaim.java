// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OptionalClaim model.
 */
@Fluent
public final class OptionalClaim {
    /*
     * Claim name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Claim source.
     */
    @JsonProperty(value = "source")
    private String source;

    /*
     * Is this a required claim.
     */
    @JsonProperty(value = "essential")
    private Boolean essential;

    /*
     * MISSING·SCHEMA-DESCRIPTION-OBJECTSCHEMA
     */
    @JsonProperty(value = "additionalProperties")
    private Object additionalProperties;

    /**
     * Get the name property: Claim name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Claim name.
     * 
     * @param name the name value to set.
     * @return the OptionalClaim object itself.
     */
    public OptionalClaim setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the source property: Claim source.
     * 
     * @return the source value.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Set the source property: Claim source.
     * 
     * @param source the source value to set.
     * @return the OptionalClaim object itself.
     */
    public OptionalClaim setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the essential property: Is this a required claim.
     * 
     * @return the essential value.
     */
    public Boolean isEssential() {
        return this.essential;
    }

    /**
     * Set the essential property: Is this a required claim.
     * 
     * @param essential the essential value to set.
     * @return the OptionalClaim object itself.
     */
    public OptionalClaim setEssential(Boolean essential) {
        this.essential = essential;
        return this;
    }

    /**
     * Get the additionalProperties property:
     * MISSING·SCHEMA-DESCRIPTION-OBJECTSCHEMA.
     * 
     * @return the additionalProperties value.
     */
    public Object getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property:
     * MISSING·SCHEMA-DESCRIPTION-OBJECTSCHEMA.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the OptionalClaim object itself.
     */
    public OptionalClaim setAdditionalProperties(Object additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }
}
