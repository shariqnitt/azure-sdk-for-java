// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The GetObjectsParameters model.
 */
@Fluent
public final class GetObjectsParameters {
    /*
     * The requested object IDs.
     */
    @JsonProperty(value = "objectIds")
    private List<String> objectIds;

    /*
     * The requested object types.
     */
    @JsonProperty(value = "types")
    private List<String> types;

    /*
     * If true, also searches for object IDs in the partner tenant.
     */
    @JsonProperty(value = "includeDirectoryObjectReferences")
    private Boolean includeDirectoryObjectReferences;

    /*
     * Request parameters for the GetObjectsByObjectIds API.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Get the objectIds property: The requested object IDs.
     * 
     * @return the objectIds value.
     */
    public List<String> getObjectIds() {
        return this.objectIds;
    }

    /**
     * Set the objectIds property: The requested object IDs.
     * 
     * @param objectIds the objectIds value to set.
     * @return the GetObjectsParameters object itself.
     */
    public GetObjectsParameters setObjectIds(List<String> objectIds) {
        this.objectIds = objectIds;
        return this;
    }

    /**
     * Get the types property: The requested object types.
     * 
     * @return the types value.
     */
    public List<String> getTypes() {
        return this.types;
    }

    /**
     * Set the types property: The requested object types.
     * 
     * @param types the types value to set.
     * @return the GetObjectsParameters object itself.
     */
    public GetObjectsParameters setTypes(List<String> types) {
        this.types = types;
        return this;
    }

    /**
     * Get the includeDirectoryObjectReferences property: If true, also
     * searches for object IDs in the partner tenant.
     * 
     * @return the includeDirectoryObjectReferences value.
     */
    public Boolean isIncludeDirectoryObjectReferences() {
        return this.includeDirectoryObjectReferences;
    }

    /**
     * Set the includeDirectoryObjectReferences property: If true, also
     * searches for object IDs in the partner tenant.
     * 
     * @param includeDirectoryObjectReferences the
     * includeDirectoryObjectReferences value to set.
     * @return the GetObjectsParameters object itself.
     */
    public GetObjectsParameters setIncludeDirectoryObjectReferences(Boolean includeDirectoryObjectReferences) {
        this.includeDirectoryObjectReferences = includeDirectoryObjectReferences;
        return this;
    }

    /**
     * Get the additionalProperties property: Request parameters for the
     * GetObjectsByObjectIds API.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Request parameters for the
     * GetObjectsByObjectIds API.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the GetObjectsParameters object itself.
     */
    public GetObjectsParameters setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }
}
