// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.cosmosdb.ARMResourceProperties;
import com.azure.management.cosmosdb.MongoDBDatabaseGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MongoDBDatabaseGetResults model.
 */
@JsonFlatten
@Fluent
public class MongoDBDatabaseGetResultsInner extends ARMResourceProperties {
    /*
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private MongoDBDatabaseGetPropertiesResource resource;

    /**
     * Get the resource property: The resource property.
     * 
     * @return the resource value.
     */
    public MongoDBDatabaseGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     * 
     * @param resource the resource value to set.
     * @return the MongoDBDatabaseGetResultsInner object itself.
     */
    public MongoDBDatabaseGetResultsInner withResource(MongoDBDatabaseGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }
}
