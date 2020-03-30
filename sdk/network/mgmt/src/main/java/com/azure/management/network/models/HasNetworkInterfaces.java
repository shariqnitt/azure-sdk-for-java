/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.network.NetworkInterface;
import com.azure.management.resources.fluentcore.arm.models.HasId;

import java.util.List;

/**
 * Interface exposing a list of network interfaces.
 */
@Fluent()
public interface HasNetworkInterfaces extends HasId {
    /**
     * Gets the primary network interface.
     * <p>
     * Note that this method can result in a call to the cloud to fetch the network interface information.
     *
     * @return the primary network interface associated with this resource
     */
    NetworkInterface getPrimaryNetworkInterface();

    /**
     * @return the resource id of the primary network interface associated with this resource
     */
    String primaryNetworkInterfaceId();

    /**
     * @return the list of resource IDs of the network interfaces associated with this resource
     */
    List<String> networkInterfaceIds();
}
