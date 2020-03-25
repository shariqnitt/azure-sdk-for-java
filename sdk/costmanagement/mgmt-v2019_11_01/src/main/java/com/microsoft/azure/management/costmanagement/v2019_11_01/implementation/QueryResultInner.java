/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2019_11_01.implementation;

import java.util.List;
import com.microsoft.azure.management.costmanagement.v2019_11_01.QueryColumn;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Result of query. It contains all columns listed under groupings and
 * aggregation.
 */
@JsonFlatten
public class QueryResultInner extends ProxyResource {
    /**
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "properties.nextLink")
    private String nextLink;

    /**
     * Array of columns.
     */
    @JsonProperty(value = "properties.columns")
    private List<QueryColumn> columns;

    /**
     * Array of rows.
     */
    @JsonProperty(value = "properties.rows")
    private List<List<Object>> rows;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the link (url) to the next page of results.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the link (url) to the next page of results.
     *
     * @param nextLink the nextLink value to set
     * @return the QueryResultInner object itself.
     */
    public QueryResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get array of columns.
     *
     * @return the columns value
     */
    public List<QueryColumn> columns() {
        return this.columns;
    }

    /**
     * Set array of columns.
     *
     * @param columns the columns value to set
     * @return the QueryResultInner object itself.
     */
    public QueryResultInner withColumns(List<QueryColumn> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get array of rows.
     *
     * @return the rows value
     */
    public List<List<Object>> rows() {
        return this.rows;
    }

    /**
     * Set array of rows.
     *
     * @param rows the rows value to set
     * @return the QueryResultInner object itself.
     */
    public QueryResultInner withRows(List<List<Object>> rows) {
        this.rows = rows;
        return this;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

}
