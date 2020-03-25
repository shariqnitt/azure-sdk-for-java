// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.models;

import com.azure.cosmos.ChangeFeedProcessor;

import java.time.Duration;
import java.time.OffsetDateTime;

/**
 * Specifies the options associated with {@link ChangeFeedProcessor}.
 */
public final class ChangeFeedProcessorOptions {
    private static final Duration DEFAULT_RENEW_INTERVAL = Duration.ofMillis(0).plusSeconds(17);
    private static final Duration DEFAULT_ACQUIRE_INTERVAL = Duration.ofMillis(0).plusSeconds(13);
    private static final Duration DEFAULT_EXPIRATION_INTERVAL = Duration.ofMillis(0).plusSeconds(60);
    private static final Duration DEFAULT_FEED_POLL_DELAY = Duration.ofMillis(0).plusSeconds(5);

    private Duration leaseRenewInterval;
    private Duration leaseAcquireInterval;
    private Duration leaseExpirationInterval;
    private Duration feedPollDelay;

    private String leasePrefix;
    private int maxItemCount;
    private String startContinuation;
    private OffsetDateTime startTime;
    private boolean startFromBeginning;
    private int minScaleCount;
    private int maxScaleCount;
    private boolean discardExistingLeases;

    /**
     * Instantiates a new Change feed processor options.
     */
    public ChangeFeedProcessorOptions() {
        this.maxItemCount = 100;
        this.startFromBeginning = false;
        this.leaseRenewInterval = DEFAULT_RENEW_INTERVAL;
        this.leaseAcquireInterval = DEFAULT_ACQUIRE_INTERVAL;
        this.leaseExpirationInterval = DEFAULT_EXPIRATION_INTERVAL;
        this.feedPollDelay = DEFAULT_FEED_POLL_DELAY;
        this.maxScaleCount = 0; // unlimited
    }

    /**
     * Gets the renew interval for all leases for partitions currently held by {@link ChangeFeedProcessor} instance.
     *
     * @return the renew interval for all leases for partitions.
     */
    public Duration getLeaseRenewInterval() {
        return this.leaseRenewInterval;
    }

    /**
     * Sets the renew interval for all leases for partitions currently held by {@link ChangeFeedProcessor} instance.
     *
     * @param leaseRenewInterval the renew interval for all leases for partitions currently held by
     * {@link ChangeFeedProcessor} instance.
     * @return the current ChangeFeedProcessorOptions instance.
     */
    public ChangeFeedProcessorOptions setLeaseRenewInterval(Duration leaseRenewInterval) {
        this.leaseRenewInterval = leaseRenewInterval;
        return this;
    }

    /**
     * Gets the interval to kick off a task to compute if partitions are distributed evenly among known host instances.
     *
     * @return the interval to kick off a task to compute if partitions are distributed evenly among known host
     * instances.
     */
    public Duration getLeaseAcquireInterval() {
        return this.leaseAcquireInterval;
    }

    /**
     * Sets he interval to kick off a task to compute if partitions are distributed evenly among known host instances.
     *
     * @param leaseAcquireInterval he interval to kick off a task to compute if partitions are distributed evenly
     * among known host instances.
     * @return the current ChangeFeedProcessorOptions instance.
     */
    public ChangeFeedProcessorOptions setLeaseAcquireInterval(Duration leaseAcquireInterval) {
        this.leaseAcquireInterval = leaseAcquireInterval;
        return this;
    }

    /**
     * Gets the interval for which the lease is taken on a lease representing a partition.
     *
     * <p>
     * If the lease is not renewed within this interval, it will cause it to expire and ownership of the partition will
     * move to another {@link ChangeFeedProcessor} instance.
     *
     * @return the interval for which the lease is taken on a lease representing a partition.
     */
    public Duration getLeaseExpirationInterval() {
        return this.leaseExpirationInterval;
    }

    /**
     * Sets the interval for which the lease is taken on a lease representing a partition.
     *
     * <p>
     * If the lease is not renewed within this interval, it will cause it to expire and ownership of the partition will
     * move to another {@link ChangeFeedProcessor} instance.
     *
     * @param leaseExpirationInterval the interval for which the lease is taken on a lease representing a partition.
     * @return the current ChangeFeedProcessorOptions instance.
     */
    public ChangeFeedProcessorOptions setLeaseExpirationInterval(Duration leaseExpirationInterval) {
        this.leaseExpirationInterval = leaseExpirationInterval;
        return this;
    }

    /**
     * Gets the delay in between polling a partition for new changes on the feed, after all current changes are drained.
     *
     * @return the delay in between polling a partition for new changes on the feed.
     */
    public Duration getFeedPollDelay() {
        return this.feedPollDelay;
    }

    /**
     * Sets the delay in between polling a partition for new changes on the feed, after all current changes are drained.
     *
     * @param feedPollDelay the delay in between polling a partition for new changes on the feed, after all current
     * changes are drained.
     * @return the current ChangeFeedProcessorOptions instance.
     */
    public ChangeFeedProcessorOptions setFeedPollDelay(Duration feedPollDelay) {
        this.feedPollDelay = feedPollDelay;
        return this;
    }

    /**
     * Gets a prefix to be used as part of the lease ID.
     * <p>
     * This can be used to support multiple instances of {@link ChangeFeedProcessor} instances pointing at the same
     * feed while using the same auxiliary collection.
     *
     * @return a prefix to be used as part of the lease ID.
     */
    public String getLeasePrefix() {
        return this.leasePrefix;
    }

    /**
     * Sets a prefix to be used as part of the lease ID.
     *
     * @param leasePrefix a prefix to be used as part of the lease ID.
     * @return the current ChangeFeedProcessorOptions instance.
     */
    public ChangeFeedProcessorOptions setLeasePrefix(String leasePrefix) {
        this.leasePrefix = leasePrefix;
        return this;
    }

    /**
     * Gets the maximum number of items to be returned in the enumeration operation in the Azure Cosmos DB service.
     *
     * @return the maximum number of items to be returned in the enumeration operation in the Azure Cosmos DB service.
     */
    public int getMaxItemCount() {
        return this.maxItemCount;
    }

    /**
     * Sets the maximum number of items to be returned in the enumeration operation.
     *
     * @param maxItemCount the maximum number of items to be returned in the enumeration operation.
     * @return the current ChangeFeedProcessorOptions instance.
     */
    public ChangeFeedProcessorOptions setMaxItemCount(int maxItemCount) {
        this.maxItemCount = maxItemCount;
        return this;
    }

    /**
     * Gets the start request continuation token to start looking for changes after.
     * <p>
     * This is only used when lease store is not initialized and is ignored if a lease for partition exists and
     * has continuation token. If this is specified, both StartTime and StartFromBeginning are ignored.
     *
     * @return the start request continuation token to start looking for changes after.
     */
    public String getStartContinuation() {
        return this.startContinuation;
    }

    /**
     * Sets the start request continuation token to start looking for changes after.
     * <p>
     * This is only used when lease store is not initialized and is ignored if a lease for partition exists and
     * has continuation token. If this is specified, both StartTime and StartFromBeginning are ignored.
     *
     * @param startContinuation the start request continuation token to start looking for changes after.
     * @return the current ChangeFeedProcessorOptions instance.
     */
    public ChangeFeedProcessorOptions setStartContinuation(String startContinuation) {
        this.startContinuation = startContinuation;
        return this;
    }

    /**
     * Gets the time (exclusive) to start looking for changes after.
     * <p>
     * This is only used when:
     * (1) Lease store is not initialized and is ignored if a lease for partition exists and has continuation token.
     * (2) StartContinuation is not specified.
     * If this is specified, StartFromBeginning is ignored.
     *
     * @return the time (exclusive) to start looking for changes after.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Sets the time (exclusive) to start looking for changes after (UTC time).
     * <p>
     * This is only used when:
     * (1) Lease store is not initialized and is ignored if a lease for partition exists and has continuation token.
     * (2) StartContinuation is not specified.
     * If this is specified, StartFromBeginning is ignored.
     *
     * @param startTime the time (exclusive) to start looking for changes after.
     * @return the current ChangeFeedProcessorOptions instance.
     */
    public ChangeFeedProcessorOptions setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Gets a value indicating whether change feed in the Azure Cosmos DB service should start from beginning (true)
     * or from current (false). By default it's start from current (false).
     * <p>
     * This is only used when:
     * (1) Lease store is not initialized and is ignored if a lease for partition exists and has continuation token.
     * (2) StartContinuation is not specified.
     * (3) StartTime is not specified.
     *
     * @return a value indicating whether change feed in the Azure Cosmos DB service should start from.
     */
    public boolean isStartFromBeginning() {
        return this.startFromBeginning;
    }

    /**
     * Sets a value indicating whether change feed in the Azure Cosmos DB service should start from beginning.
     * <p>
     * This is only used when:
     * (1) Lease store is not initialized and is ignored if a lease for partition exists and has continuation token.
     * (2) StartContinuation is not specified.
     * (3) StartTime is not specified.
     *
     * @param startFromBeginning Indicates to start from beginning if true
     * @return the current ChangeFeedProcessorOptions instance.
     */
    public ChangeFeedProcessorOptions setStartFromBeginning(boolean startFromBeginning) {
        this.startFromBeginning = startFromBeginning;
        return this;
    }

    /**
     * Gets the minimum partition count for the host.
     * <p>
     * This can be used to increase the number of partitions for the host and thus override equal distribution (which
     * is the default) of leases between hosts.
     *
     * @return the minimum scale count for the host.
     */
    public int getMinScaleCount() {
        return this.minScaleCount;
    }

    /**
     * Sets the minimum partition count for the host.
     * <p>
     * This can be used to increase the number of partitions for the host and thus override equal distribution (which
     * is the default) of leases between hosts.
     *
     * @param minScaleCount the minimum partition count for the host.
     * @return the current ChangeFeedProcessorOptions instance.
     */
    public ChangeFeedProcessorOptions setMinScaleCount(int minScaleCount) {
        this.minScaleCount = minScaleCount;
        return this;
    }

    /**
     * Gets the maximum number of partitions the host can serve.
     * <p>
     * This can be used property to limit the number of partitions for the host and thus override equal distribution
     * (which is the default) of leases between hosts. DEFAULT is 0 (unlimited).
     *
     * @return the maximum number of partitions the host can serve.
     */
    public int getMaxScaleCount() {
        return this.maxScaleCount;
    }

    /**
     * Sets the maximum number of partitions the host can serve.
     *
     * @param maxScaleCount the maximum number of partitions the host can serve.
     * @return the current ChangeFeedProcessorOptions instance.
     */
    public ChangeFeedProcessorOptions setMaxScaleCount(int maxScaleCount) {
        this.maxScaleCount = maxScaleCount;
        return this;
    }

    /**
     * Gets a value indicating whether on start of the host all existing leases should be deleted and the host
     * should start from scratch.
     *
     * @return a value indicating whether on start of the host all existing leases should be deleted and the host
     * should start from scratch.
     */
    public boolean isExistingLeasesDiscarded() {
        return this.discardExistingLeases;
    }

    /**
     * Sets a value indicating whether on start of the host all existing leases should be deleted and the host
     * should start from scratch.
     *
     * @param discardExistingLeases Indicates whether to discard all existing leases if true
     * @return the current ChangeFeedProcessorOptions instance.
     */
    public ChangeFeedProcessorOptions setExistingLeasesDiscarded(boolean discardExistingLeases) {
        this.discardExistingLeases = discardExistingLeases;
        return this;
    }
}
