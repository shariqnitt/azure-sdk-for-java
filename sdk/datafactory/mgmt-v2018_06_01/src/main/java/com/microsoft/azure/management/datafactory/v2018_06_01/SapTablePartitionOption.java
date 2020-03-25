/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SapTablePartitionOption.
 */
public final class SapTablePartitionOption extends ExpandableStringEnum<SapTablePartitionOption> {
    /** Static value None for SapTablePartitionOption. */
    public static final SapTablePartitionOption NONE = fromString("None");

    /** Static value PartitionOnInt for SapTablePartitionOption. */
    public static final SapTablePartitionOption PARTITION_ON_INT = fromString("PartitionOnInt");

    /** Static value PartitionOnCalendarYear for SapTablePartitionOption. */
    public static final SapTablePartitionOption PARTITION_ON_CALENDAR_YEAR = fromString("PartitionOnCalendarYear");

    /** Static value PartitionOnCalendarMonth for SapTablePartitionOption. */
    public static final SapTablePartitionOption PARTITION_ON_CALENDAR_MONTH = fromString("PartitionOnCalendarMonth");

    /** Static value PartitionOnCalendarDate for SapTablePartitionOption. */
    public static final SapTablePartitionOption PARTITION_ON_CALENDAR_DATE = fromString("PartitionOnCalendarDate");

    /** Static value PartitionOnTime for SapTablePartitionOption. */
    public static final SapTablePartitionOption PARTITION_ON_TIME = fromString("PartitionOnTime");

    /**
     * Creates or finds a SapTablePartitionOption from its string representation.
     * @param name a name to look for
     * @return the corresponding SapTablePartitionOption
     */
    @JsonCreator
    public static SapTablePartitionOption fromString(String name) {
        return fromString(name, SapTablePartitionOption.class);
    }

    /**
     * @return known SapTablePartitionOption values
     */
    public static Collection<SapTablePartitionOption> values() {
        return values(SapTablePartitionOption.class);
    }
}
