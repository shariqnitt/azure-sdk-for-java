/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation;

import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PartnerNamespaceProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * EventGrid Partner Namespace.
 */
@JsonFlatten
public class PartnerNamespaceInner extends Resource {
    /**
     * Provisioning state of the partner namespace. Possible values include:
     * 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PartnerNamespaceProvisioningState provisioningState;

    /**
     * The fully qualified ARM Id of the partner registration that should be
     * associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     */
    @JsonProperty(value = "properties.partnerRegistrationFullyQualifiedId")
    private String partnerRegistrationFullyQualifiedId;

    /**
     * Endpoint for the partner namespace.
     */
    @JsonProperty(value = "properties.endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * Get provisioning state of the partner namespace. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     *
     * @return the provisioningState value
     */
    public PartnerNamespaceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the fully qualified ARM Id of the partner registration that should be associated with this partner namespace. This takes the following format:
     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     *
     * @return the partnerRegistrationFullyQualifiedId value
     */
    public String partnerRegistrationFullyQualifiedId() {
        return this.partnerRegistrationFullyQualifiedId;
    }

    /**
     * Set the fully qualified ARM Id of the partner registration that should be associated with this partner namespace. This takes the following format:
     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     *
     * @param partnerRegistrationFullyQualifiedId the partnerRegistrationFullyQualifiedId value to set
     * @return the PartnerNamespaceInner object itself.
     */
    public PartnerNamespaceInner withPartnerRegistrationFullyQualifiedId(String partnerRegistrationFullyQualifiedId) {
        this.partnerRegistrationFullyQualifiedId = partnerRegistrationFullyQualifiedId;
        return this;
    }

    /**
     * Get endpoint for the partner namespace.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

}
