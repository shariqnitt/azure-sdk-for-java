// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for SyncDirection.
 */
public final class SyncDirection extends ExpandableStringEnum<SyncDirection> {
    /**
     * Static value Bidirectional for SyncDirection.
     */
    public static final SyncDirection BIDIRECTIONAL = fromString("Bidirectional");

    /**
     * Static value OneWayMemberToHub for SyncDirection.
     */
    public static final SyncDirection ONE_WAY_MEMBER_TO_HUB = fromString("OneWayMemberToHub");

    /**
     * Static value OneWayHubToMember for SyncDirection.
     */
    public static final SyncDirection ONE_WAY_HUB_TO_MEMBER = fromString("OneWayHubToMember");

    /**
     * Creates or finds a SyncDirection from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SyncDirection.
     */
    @JsonCreator
    public static SyncDirection fromString(String name) {
        return fromString(name, SyncDirection.class);
    }

    /**
     * @return known SyncDirection values.
     */
    public static Collection<SyncDirection> values() {
        return values(SyncDirection.class);
    }
}
