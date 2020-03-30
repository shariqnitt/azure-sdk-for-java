// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The CassandraSchema model.
 */
@Fluent
public final class CassandraSchema {
    /*
     * List of Cassandra table columns.
     */
    @JsonProperty(value = "columns")
    private List<Column> columns;

    /*
     * List of partition key.
     */
    @JsonProperty(value = "partitionKeys")
    private List<CassandraPartitionKey> partitionKeys;

    /*
     * List of cluster key.
     */
    @JsonProperty(value = "clusterKeys")
    private List<ClusterKey> clusterKeys;

    /**
     * Get the columns property: List of Cassandra table columns.
     * 
     * @return the columns value.
     */
    public List<Column> columns() {
        return this.columns;
    }

    /**
     * Set the columns property: List of Cassandra table columns.
     * 
     * @param columns the columns value to set.
     * @return the CassandraSchema object itself.
     */
    public CassandraSchema withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the partitionKeys property: List of partition key.
     * 
     * @return the partitionKeys value.
     */
    public List<CassandraPartitionKey> partitionKeys() {
        return this.partitionKeys;
    }

    /**
     * Set the partitionKeys property: List of partition key.
     * 
     * @param partitionKeys the partitionKeys value to set.
     * @return the CassandraSchema object itself.
     */
    public CassandraSchema withPartitionKeys(List<CassandraPartitionKey> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }

    /**
     * Get the clusterKeys property: List of cluster key.
     * 
     * @return the clusterKeys value.
     */
    public List<ClusterKey> clusterKeys() {
        return this.clusterKeys;
    }

    /**
     * Set the clusterKeys property: List of cluster key.
     * 
     * @param clusterKeys the clusterKeys value to set.
     * @return the CassandraSchema object itself.
     */
    public CassandraSchema withClusterKeys(List<ClusterKey> clusterKeys) {
        this.clusterKeys = clusterKeys;
        return this;
    }
}
