// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.policy;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * This class handles adding SPI plug-able policies to a pipeline automatically.
 */
public final class HttpPolicyProviders {
    private static final String INVALID_POLICY = "HttpPipelinePolicy created with %s resulted in a null policy.";

    private static final List<BeforeRetryPolicyProvider> BEFORE_PROVIDER = new ArrayList<>();
    private static final List<AfterRetryPolicyProvider> AFTER_PROVIDER = new ArrayList<>();

    static {
        ServiceLoader.load(BeforeRetryPolicyProvider.class).forEach(BEFORE_PROVIDER::add);
        ServiceLoader.load(AfterRetryPolicyProvider.class).forEach(AFTER_PROVIDER::add);
    }

    private HttpPolicyProviders() {
        // no-op
    }

    /**
     * Adds SPI policies that implement {@link BeforeRetryPolicyProvider}.
     *
     * @param policies Policy list to append the policies.
     */
    public static void addBeforeRetryPolicies(List<HttpPipelinePolicy> policies) {
        addPolices(policies, BEFORE_PROVIDER);
    }

    /**
     * Adds SPI policies that implement {@link AfterRetryPolicyProvider}.
     *
     * @param policies Policy list to append the policies.
     */
    public static void addAfterRetryPolicies(List<HttpPipelinePolicy> policies) {
        addPolices(policies, AFTER_PROVIDER);
    }

    private static void addPolices(List<HttpPipelinePolicy> policies, List<? extends HttpPolicyProvider> providers) {
        for (HttpPolicyProvider provider : providers) {
            HttpPipelinePolicy policy = provider.create();
            if (policy == null) {
                throw new NullPointerException(String.format(INVALID_POLICY, provider.getClass()));
            }

            policies.add(policy);
        }
    }
}
