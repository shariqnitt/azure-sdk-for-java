/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for ResourceNavigationLinks_List operation.
 */
public class ResourceNavigationLinksListResultInner {
    /**
     * The resource navigation links in a subnet.
     */
    @JsonProperty(value = "value")
    private List<ResourceNavigationLinkInner> value;

    /**
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the resource navigation links in a subnet.
     *
     * @return the value value
     */
    public List<ResourceNavigationLinkInner> value() {
        return this.value;
    }

    /**
     * Set the resource navigation links in a subnet.
     *
     * @param value the value value to set
     * @return the ResourceNavigationLinksListResultInner object itself.
     */
    public ResourceNavigationLinksListResultInner withValue(List<ResourceNavigationLinkInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the URL to get the next set of results.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

}
