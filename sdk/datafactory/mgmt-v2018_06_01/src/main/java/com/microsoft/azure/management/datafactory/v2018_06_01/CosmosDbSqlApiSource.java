/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Azure CosmosDB (SQL API) Collection source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = CosmosDbSqlApiSource.class)
@JsonTypeName("CosmosDbSqlApiSource")
public class CosmosDbSqlApiSource extends CopySource {
    /**
     * SQL API query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * Page size of the result. Type: integer (or Expression with resultType
     * integer).
     */
    @JsonProperty(value = "pageSize")
    private Object pageSize;

    /**
     * Preferred regions. Type: array of strings (or Expression with resultType
     * array of strings).
     */
    @JsonProperty(value = "preferredRegions")
    private Object preferredRegions;

    /**
     * Specifies the additional columns to be added to source data. Type: array
     * of objects (or Expression with resultType array of objects).
     */
    @JsonProperty(value = "additionalColumns")
    private List<AdditionalColumns> additionalColumns;

    /**
     * Get sQL API query. Type: string (or Expression with resultType string).
     *
     * @return the query value
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set sQL API query. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set
     * @return the CosmosDbSqlApiSource object itself.
     */
    public CosmosDbSqlApiSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get page size of the result. Type: integer (or Expression with resultType integer).
     *
     * @return the pageSize value
     */
    public Object pageSize() {
        return this.pageSize;
    }

    /**
     * Set page size of the result. Type: integer (or Expression with resultType integer).
     *
     * @param pageSize the pageSize value to set
     * @return the CosmosDbSqlApiSource object itself.
     */
    public CosmosDbSqlApiSource withPageSize(Object pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get preferred regions. Type: array of strings (or Expression with resultType array of strings).
     *
     * @return the preferredRegions value
     */
    public Object preferredRegions() {
        return this.preferredRegions;
    }

    /**
     * Set preferred regions. Type: array of strings (or Expression with resultType array of strings).
     *
     * @param preferredRegions the preferredRegions value to set
     * @return the CosmosDbSqlApiSource object itself.
     */
    public CosmosDbSqlApiSource withPreferredRegions(Object preferredRegions) {
        this.preferredRegions = preferredRegions;
        return this;
    }

    /**
     * Get specifies the additional columns to be added to source data. Type: array of objects (or Expression with resultType array of objects).
     *
     * @return the additionalColumns value
     */
    public List<AdditionalColumns> additionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set specifies the additional columns to be added to source data. Type: array of objects (or Expression with resultType array of objects).
     *
     * @param additionalColumns the additionalColumns value to set
     * @return the CosmosDbSqlApiSource object itself.
     */
    public CosmosDbSqlApiSource withAdditionalColumns(List<AdditionalColumns> additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }

}
