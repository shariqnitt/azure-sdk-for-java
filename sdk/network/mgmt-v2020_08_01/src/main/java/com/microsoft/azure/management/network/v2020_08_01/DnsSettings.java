/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DNS Proxy Settings in Firewall Policy.
 */
public class DnsSettings {
    /**
     * List of Custom DNS Servers.
     */
    @JsonProperty(value = "servers")
    private List<String> servers;

    /**
     * Enable DNS Proxy on Firewalls attached to the Firewall Policy.
     */
    @JsonProperty(value = "enableProxy")
    private Boolean enableProxy;

    /**
     * FQDNs in Network Rules are supported when set to true.
     */
    @JsonProperty(value = "requireProxyForNetworkRules")
    private Boolean requireProxyForNetworkRules;

    /**
     * Get list of Custom DNS Servers.
     *
     * @return the servers value
     */
    public List<String> servers() {
        return this.servers;
    }

    /**
     * Set list of Custom DNS Servers.
     *
     * @param servers the servers value to set
     * @return the DnsSettings object itself.
     */
    public DnsSettings withServers(List<String> servers) {
        this.servers = servers;
        return this;
    }

    /**
     * Get enable DNS Proxy on Firewalls attached to the Firewall Policy.
     *
     * @return the enableProxy value
     */
    public Boolean enableProxy() {
        return this.enableProxy;
    }

    /**
     * Set enable DNS Proxy on Firewalls attached to the Firewall Policy.
     *
     * @param enableProxy the enableProxy value to set
     * @return the DnsSettings object itself.
     */
    public DnsSettings withEnableProxy(Boolean enableProxy) {
        this.enableProxy = enableProxy;
        return this;
    }

    /**
     * Get fQDNs in Network Rules are supported when set to true.
     *
     * @return the requireProxyForNetworkRules value
     */
    public Boolean requireProxyForNetworkRules() {
        return this.requireProxyForNetworkRules;
    }

    /**
     * Set fQDNs in Network Rules are supported when set to true.
     *
     * @param requireProxyForNetworkRules the requireProxyForNetworkRules value to set
     * @return the DnsSettings object itself.
     */
    public DnsSettings withRequireProxyForNetworkRules(Boolean requireProxyForNetworkRules) {
        this.requireProxyForNetworkRules = requireProxyForNetworkRules;
        return this;
    }

}
