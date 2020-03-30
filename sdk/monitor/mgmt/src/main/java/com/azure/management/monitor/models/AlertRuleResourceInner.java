// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.monitor.RuleAction;
import com.azure.management.monitor.RuleCondition;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The AlertRuleResource model.
 */
@JsonFlatten
@Fluent
public class AlertRuleResourceInner extends Resource {
    /*
     * the name of the alert rule.
     */
    @JsonProperty(value = "properties.name", required = true)
    private String namePropertiesName;

    /*
     * the description of the alert rule that will be included in the alert
     * email.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * the flag that indicates whether the alert rule is enabled.
     */
    @JsonProperty(value = "properties.isEnabled", required = true)
    private boolean isEnabled;

    /*
     * the condition that results in the alert rule being activated.
     */
    @JsonProperty(value = "properties.condition", required = true)
    private RuleCondition condition;

    /*
     * the array of actions that are performed when the alert rule becomes
     * active, and when an alert condition is resolved.
     */
    @JsonProperty(value = "properties.actions")
    private List<RuleAction> actions;

    /*
     * Last time the rule was updated in ISO8601 format.
     */
    @JsonProperty(value = "properties.lastUpdatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedTime;

    /**
     * Get the namePropertiesName property: the name of the alert rule.
     * 
     * @return the namePropertiesName value.
     */
    public String namePropertiesName() {
        return this.namePropertiesName;
    }

    /**
     * Set the namePropertiesName property: the name of the alert rule.
     * 
     * @param namePropertiesName the namePropertiesName value to set.
     * @return the AlertRuleResourceInner object itself.
     */
    public AlertRuleResourceInner withNamePropertiesName(String namePropertiesName) {
        this.namePropertiesName = namePropertiesName;
        return this;
    }

    /**
     * Get the description property: the description of the alert rule that
     * will be included in the alert email.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: the description of the alert rule that
     * will be included in the alert email.
     * 
     * @param description the description value to set.
     * @return the AlertRuleResourceInner object itself.
     */
    public AlertRuleResourceInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the isEnabled property: the flag that indicates whether the alert
     * rule is enabled.
     * 
     * @return the isEnabled value.
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: the flag that indicates whether the alert
     * rule is enabled.
     * 
     * @param isEnabled the isEnabled value to set.
     * @return the AlertRuleResourceInner object itself.
     */
    public AlertRuleResourceInner withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the condition property: the condition that results in the alert rule
     * being activated.
     * 
     * @return the condition value.
     */
    public RuleCondition condition() {
        return this.condition;
    }

    /**
     * Set the condition property: the condition that results in the alert rule
     * being activated.
     * 
     * @param condition the condition value to set.
     * @return the AlertRuleResourceInner object itself.
     */
    public AlertRuleResourceInner withCondition(RuleCondition condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the actions property: the array of actions that are performed when
     * the alert rule becomes active, and when an alert condition is resolved.
     * 
     * @return the actions value.
     */
    public List<RuleAction> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: the array of actions that are performed when
     * the alert rule becomes active, and when an alert condition is resolved.
     * 
     * @param actions the actions value to set.
     * @return the AlertRuleResourceInner object itself.
     */
    public AlertRuleResourceInner withActions(List<RuleAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the lastUpdatedTime property: Last time the rule was updated in
     * ISO8601 format.
     * 
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
}
