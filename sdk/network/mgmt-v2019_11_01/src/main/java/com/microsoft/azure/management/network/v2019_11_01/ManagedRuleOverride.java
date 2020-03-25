/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a managed rule group override setting.
 */
public class ManagedRuleOverride {
    /**
     * Identifier for the managed rule.
     */
    @JsonProperty(value = "ruleId", required = true)
    private String ruleId;

    /**
     * The state of the managed rule. Defaults to Disabled if not specified.
     * Possible values include: 'Disabled'.
     */
    @JsonProperty(value = "state")
    private ManagedRuleEnabledState state;

    /**
     * Get identifier for the managed rule.
     *
     * @return the ruleId value
     */
    public String ruleId() {
        return this.ruleId;
    }

    /**
     * Set identifier for the managed rule.
     *
     * @param ruleId the ruleId value to set
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get the state of the managed rule. Defaults to Disabled if not specified. Possible values include: 'Disabled'.
     *
     * @return the state value
     */
    public ManagedRuleEnabledState state() {
        return this.state;
    }

    /**
     * Set the state of the managed rule. Defaults to Disabled if not specified. Possible values include: 'Disabled'.
     *
     * @param state the state value to set
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride withState(ManagedRuleEnabledState state) {
        this.state = state;
        return this;
    }

}
