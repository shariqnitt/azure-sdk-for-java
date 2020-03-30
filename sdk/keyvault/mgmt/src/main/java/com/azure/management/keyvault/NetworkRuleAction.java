// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for NetworkRuleAction.
 */
public final class NetworkRuleAction extends ExpandableStringEnum<NetworkRuleAction> {
    /**
     * Static value Allow for NetworkRuleAction.
     */
    public static final NetworkRuleAction ALLOW = fromString("Allow");

    /**
     * Static value Deny for NetworkRuleAction.
     */
    public static final NetworkRuleAction DENY = fromString("Deny");

    /**
     * Creates or finds a NetworkRuleAction from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NetworkRuleAction.
     */
    @JsonCreator
    public static NetworkRuleAction fromString(String name) {
        return fromString(name, NetworkRuleAction.class);
    }

    /**
     * @return known NetworkRuleAction values.
     */
    public static Collection<NetworkRuleAction> values() {
        return values(NetworkRuleAction.class);
    }
}
