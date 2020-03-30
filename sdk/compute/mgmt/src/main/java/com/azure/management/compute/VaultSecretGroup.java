// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The VaultSecretGroup model.
 */
@Fluent
public final class VaultSecretGroup {
    /*
     * The sourceVault property.
     */
    @JsonProperty(value = "sourceVault")
    private SubResource sourceVault;

    /*
     * The list of key vault references in SourceVault which contain
     * certificates.
     */
    @JsonProperty(value = "vaultCertificates")
    private List<VaultCertificate> vaultCertificates;

    /**
     * Get the sourceVault property: The sourceVault property.
     * 
     * @return the sourceVault value.
     */
    public SubResource sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault property: The sourceVault property.
     * 
     * @param sourceVault the sourceVault value to set.
     * @return the VaultSecretGroup object itself.
     */
    public VaultSecretGroup withSourceVault(SubResource sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Get the vaultCertificates property: The list of key vault references in
     * SourceVault which contain certificates.
     * 
     * @return the vaultCertificates value.
     */
    public List<VaultCertificate> vaultCertificates() {
        return this.vaultCertificates;
    }

    /**
     * Set the vaultCertificates property: The list of key vault references in
     * SourceVault which contain certificates.
     * 
     * @param vaultCertificates the vaultCertificates value to set.
     * @return the VaultSecretGroup object itself.
     */
    public VaultSecretGroup withVaultCertificates(List<VaultCertificate> vaultCertificates) {
        this.vaultCertificates = vaultCertificates;
        return this;
    }
}
