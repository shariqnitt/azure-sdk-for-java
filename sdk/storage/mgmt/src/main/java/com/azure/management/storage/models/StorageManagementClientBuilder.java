// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;

/**
 * A builder for creating a new instance of the StorageManagementClientImpl type.
 */
@ServiceClientBuilder(serviceClients = StorageManagementClientImpl.class)
public final class StorageManagementClientBuilder {
    /*
     * The ID of the target subscription.
     */
    private String subscriptionId;

    /**
     * Sets The ID of the target subscription.
     * 
     * @param subscriptionId the subscriptionId value.
     * @return the StorageManagementClientBuilder.
     */
    public StorageManagementClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /*
     * server parameter
     */
    private String host;

    /**
     * Sets server parameter.
     * 
     * @param host the host value.
     * @return the StorageManagementClientBuilder.
     */
    public StorageManagementClientBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * Api Version
     */
    private String apiVersion;

    /**
     * Sets Api Version.
     * 
     * @param apiVersion the apiVersion value.
     * @return the StorageManagementClientBuilder.
     */
    public StorageManagementClientBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     * 
     * @param environment the environment value.
     * @return the StorageManagementClientBuilder.
     */
    public StorageManagementClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     * 
     * @param pipeline the pipeline value.
     * @return the StorageManagementClientBuilder.
     */
    public StorageManagementClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of StorageManagementClientImpl with the provided parameters.
     * 
     * @return an instance of StorageManagementClientImpl.
     */
    public StorageManagementClientImpl build() {
        if (host == null) {
            this.host = "https://management.azure.com";
        }
        if (apiVersion == null) {
            this.apiVersion = "2019-06-01";
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        StorageManagementClientImpl client = new StorageManagementClientImpl(pipeline, environment);
        client.setSubscriptionId(this.subscriptionId);
        client.setHost(this.host);
        client.setApiVersion(this.apiVersion);
        return client;
    }
}
