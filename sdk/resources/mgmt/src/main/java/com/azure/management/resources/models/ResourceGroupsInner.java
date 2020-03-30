// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Head;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.management.resources.ExportTemplateRequest;
import com.azure.management.resources.ResourceGroupPatchable;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ResourceGroups.
 */
public final class ResourceGroupsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ResourceGroupsService service;

    /**
     * The service client containing this operation class.
     */
    private ResourceManagementClientImpl client;

    /**
     * Initializes an instance of ResourceGroupsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ResourceGroupsInner(ResourceManagementClientImpl client) {
        this.service = RestProxy.create(ResourceGroupsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ResourceManagementClientResourceGroups to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ResourceManagementClientResourceGroups")
    private interface ResourceGroupsService {
        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Head("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Boolean>> checkExistence(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ResourceGroupInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ResourceGroupInner parameters);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ResourceGroupInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ResourceGroupInner>> update(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ResourceGroupPatchable parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/exportTemplate")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> exportTemplate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") ExportTemplateRequest parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourcegroups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ResourceGroupListResultInner>> list(@HostParam("$host") String host, @QueryParam("$filter") String filter, @QueryParam("$top") Integer top, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/exportTemplate")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ResourceGroupExportResultInner>> beginExportTemplate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") ExportTemplateRequest parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ResourceGroupListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Checks whether a resource group exists.
     * 
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Boolean>> checkExistenceWithResponseAsync(String resourceGroupName) {
        return service.checkExistence(this.client.getHost(), resourceGroupName, this.client.getApiVersion(), this.client.getSubscriptionId());
    }

    /**
     * Checks whether a resource group exists.
     * 
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Boolean> checkExistenceAsync(String resourceGroupName) {
        return checkExistenceWithResponseAsync(resourceGroupName)
            .flatMap((SimpleResponse<Boolean> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Checks whether a resource group exists.
     * 
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public boolean checkExistence(String resourceGroupName) {
        return checkExistenceAsync(resourceGroupName).block();
    }

    /**
     * Creates or updates a resource group.
     * 
     * @param resourceGroupName The name of the resource group to create or update. Can include alphanumeric, underscore, parentheses, hyphen, period (except at end), and Unicode characters that match the allowed characters.
     * @param parameters Resource group information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ResourceGroupInner>> createOrUpdateWithResponseAsync(String resourceGroupName, ResourceGroupInner parameters) {
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, this.client.getApiVersion(), this.client.getSubscriptionId(), parameters);
    }

    /**
     * Creates or updates a resource group.
     * 
     * @param resourceGroupName The name of the resource group to create or update. Can include alphanumeric, underscore, parentheses, hyphen, period (except at end), and Unicode characters that match the allowed characters.
     * @param parameters Resource group information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResourceGroupInner> createOrUpdateAsync(String resourceGroupName, ResourceGroupInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, parameters)
            .flatMap((SimpleResponse<ResourceGroupInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a resource group.
     * 
     * @param resourceGroupName The name of the resource group to create or update. Can include alphanumeric, underscore, parentheses, hyphen, period (except at end), and Unicode characters that match the allowed characters.
     * @param parameters Resource group information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroupInner createOrUpdate(String resourceGroupName, ResourceGroupInner parameters) {
        return createOrUpdateAsync(resourceGroupName, parameters).block();
    }

    /**
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of its template deployments and currently stored operations.
     * 
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName) {
        return service.delete(this.client.getHost(), resourceGroupName, this.client.getApiVersion(), this.client.getSubscriptionId());
    }

    /**
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of its template deployments and currently stored operations.
     * 
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono = deleteWithResponseAsync(resourceGroupName);
        return this.client.<Void, Void>getLroResultAsync(mono, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of its template deployments and currently stored operations.
     * 
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName) {
        deleteAsync(resourceGroupName).block();
    }

    /**
     * Gets a resource group.
     * 
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ResourceGroupInner>> getWithResponseAsync(String resourceGroupName) {
        return service.get(this.client.getHost(), resourceGroupName, this.client.getApiVersion(), this.client.getSubscriptionId());
    }

    /**
     * Gets a resource group.
     * 
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResourceGroupInner> getAsync(String resourceGroupName) {
        return getWithResponseAsync(resourceGroupName)
            .flatMap((SimpleResponse<ResourceGroupInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a resource group.
     * 
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroupInner get(String resourceGroupName) {
        return getAsync(resourceGroupName).block();
    }

    /**
     * Resource groups can be updated through a simple PATCH operation to a group address. The format of the request is the same as that for creating a resource group. If a field is unspecified, the current value is retained.
     * 
     * @param resourceGroupName The name of the resource group to update. The name is case insensitive.
     * @param parameters Resource group information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ResourceGroupInner>> updateWithResponseAsync(String resourceGroupName, ResourceGroupPatchable parameters) {
        return service.update(this.client.getHost(), resourceGroupName, this.client.getApiVersion(), this.client.getSubscriptionId(), parameters);
    }

    /**
     * Resource groups can be updated through a simple PATCH operation to a group address. The format of the request is the same as that for creating a resource group. If a field is unspecified, the current value is retained.
     * 
     * @param resourceGroupName The name of the resource group to update. The name is case insensitive.
     * @param parameters Resource group information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResourceGroupInner> updateAsync(String resourceGroupName, ResourceGroupPatchable parameters) {
        return updateWithResponseAsync(resourceGroupName, parameters)
            .flatMap((SimpleResponse<ResourceGroupInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Resource groups can be updated through a simple PATCH operation to a group address. The format of the request is the same as that for creating a resource group. If a field is unspecified, the current value is retained.
     * 
     * @param resourceGroupName The name of the resource group to update. The name is case insensitive.
     * @param parameters Resource group information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroupInner update(String resourceGroupName, ResourceGroupPatchable parameters) {
        return updateAsync(resourceGroupName, parameters).block();
    }

    /**
     * Captures the specified resource group as a template.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Export resource group template request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> exportTemplateWithResponseAsync(String resourceGroupName, ExportTemplateRequest parameters) {
        return service.exportTemplate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, this.client.getApiVersion(), parameters);
    }

    /**
     * Captures the specified resource group as a template.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Export resource group template request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResourceGroupExportResultInner> exportTemplateAsync(String resourceGroupName, ExportTemplateRequest parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono = exportTemplateWithResponseAsync(resourceGroupName, parameters);
        return this.client.<ResourceGroupExportResultInner, ResourceGroupExportResultInner>getLroResultAsync(mono, this.client.getHttpPipeline(), ResourceGroupExportResultInner.class, ResourceGroupExportResultInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Captures the specified resource group as a template.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Export resource group template request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroupExportResultInner exportTemplate(String resourceGroupName, ExportTemplateRequest parameters) {
        return exportTemplateAsync(resourceGroupName, parameters).block();
    }

    /**
     * Gets all the resource groups for a subscription.
     * 
     * @param filter The filter to apply on the operation.&lt;br&gt;&lt;br&gt;You can filter by tag names and values. For example, to filter for a tag name and value, use $filter=tagName eq 'tag1' and tagValue eq 'Value1'.
     * @param top The number of results to return. If null is passed, returns all resource groups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ResourceGroupInner>> listSinglePageAsync(String filter, Integer top) {
        return service.list(this.client.getHost(), filter, top, this.client.getApiVersion(), this.client.getSubscriptionId())
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().getValue(),
                res.getValue().getNextLink(),
                null));
    }

    /**
     * Gets all the resource groups for a subscription.
     * 
     * @param filter The filter to apply on the operation.&lt;br&gt;&lt;br&gt;You can filter by tag names and values. For example, to filter for a tag name and value, use $filter=tagName eq 'tag1' and tagValue eq 'Value1'.
     * @param top The number of results to return. If null is passed, returns all resource groups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ResourceGroupInner> listAsync(String filter, Integer top) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, top),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the resource groups for a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ResourceGroupInner> listAsync() {
        final String filter = null;
        final Integer top = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, top),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the resource groups for a subscription.
     * 
     * @param filter The filter to apply on the operation.&lt;br&gt;&lt;br&gt;You can filter by tag names and values. For example, to filter for a tag name and value, use $filter=tagName eq 'tag1' and tagValue eq 'Value1'.
     * @param top The number of results to return. If null is passed, returns all resource groups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ResourceGroupInner> list(String filter, Integer top) {
        return new PagedIterable<>(listAsync(filter, top));
    }

    /**
     * Gets all the resource groups for a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ResourceGroupInner> list() {
        final String filter = null;
        final Integer top = null;
        return new PagedIterable<>(listAsync(filter, top));
    }

    /**
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of its template deployments and currently stored operations.
     * 
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName) {
        return service.beginDelete(this.client.getHost(), resourceGroupName, this.client.getApiVersion(), this.client.getSubscriptionId());
    }

    /**
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of its template deployments and currently stored operations.
     * 
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName) {
        return beginDeleteWithResponseAsync(resourceGroupName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of its template deployments and currently stored operations.
     * 
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName) {
        beginDeleteAsync(resourceGroupName).block();
    }

    /**
     * Captures the specified resource group as a template.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Export resource group template request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ResourceGroupExportResultInner>> beginExportTemplateWithResponseAsync(String resourceGroupName, ExportTemplateRequest parameters) {
        return service.beginExportTemplate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, this.client.getApiVersion(), parameters);
    }

    /**
     * Captures the specified resource group as a template.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Export resource group template request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResourceGroupExportResultInner> beginExportTemplateAsync(String resourceGroupName, ExportTemplateRequest parameters) {
        return beginExportTemplateWithResponseAsync(resourceGroupName, parameters)
            .flatMap((SimpleResponse<ResourceGroupExportResultInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Captures the specified resource group as a template.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Export resource group template request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroupExportResultInner beginExportTemplate(String resourceGroupName, ExportTemplateRequest parameters) {
        return beginExportTemplateAsync(resourceGroupName, parameters).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ResourceGroupInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().getValue(),
                res.getValue().getNextLink(),
                null));
    }
}
