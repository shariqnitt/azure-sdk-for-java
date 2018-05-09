/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.Quotas;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.SubscriptionQuotasListResult;

class QuotasImpl extends WrapperImpl<SubscriptionsInner> implements Quotas {
    private final StreamAnalyticsManager manager;

    QuotasImpl(StreamAnalyticsManager manager) {
        super(manager.inner().subscriptions());
        this.manager = manager;
    }

    public StreamAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SubscriptionQuotasListResult> listQuotasAsync(String location) {
        SubscriptionsInner client = this.inner();
        return client.listQuotasAsync(location)
        .map(new Func1<SubscriptionQuotasListResultInner, SubscriptionQuotasListResult>() {
            @Override
            public SubscriptionQuotasListResult call(SubscriptionQuotasListResultInner inner) {
                return new SubscriptionQuotasListResultImpl(inner, manager());
            }
        });
    }

}
