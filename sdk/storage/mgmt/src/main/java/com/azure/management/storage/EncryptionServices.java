// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EncryptionServices model.
 */
@Fluent
public final class EncryptionServices {
    /*
     * The encryption function of the blob storage service.
     */
    @JsonProperty(value = "blob")
    private EncryptionService blob;

    /*
     * The encryption function of the file storage service.
     */
    @JsonProperty(value = "file")
    private EncryptionService file;

    /*
     * The encryption function of the table storage service.
     */
    @JsonProperty(value = "table")
    private EncryptionService table;

    /*
     * The encryption function of the queue storage service.
     */
    @JsonProperty(value = "queue")
    private EncryptionService queue;

    /**
     * Get the blob property: The encryption function of the blob storage
     * service.
     * 
     * @return the blob value.
     */
    public EncryptionService getBlob() {
        return this.blob;
    }

    /**
     * Set the blob property: The encryption function of the blob storage
     * service.
     * 
     * @param blob the blob value to set.
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices setBlob(EncryptionService blob) {
        this.blob = blob;
        return this;
    }

    /**
     * Get the file property: The encryption function of the file storage
     * service.
     * 
     * @return the file value.
     */
    public EncryptionService getFile() {
        return this.file;
    }

    /**
     * Set the file property: The encryption function of the file storage
     * service.
     * 
     * @param file the file value to set.
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices setFile(EncryptionService file) {
        this.file = file;
        return this;
    }

    /**
     * Get the table property: The encryption function of the table storage
     * service.
     * 
     * @return the table value.
     */
    public EncryptionService getTable() {
        return this.table;
    }

    /**
     * Set the table property: The encryption function of the table storage
     * service.
     * 
     * @param table the table value to set.
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices setTable(EncryptionService table) {
        this.table = table;
        return this;
    }

    /**
     * Get the queue property: The encryption function of the queue storage
     * service.
     * 
     * @return the queue value.
     */
    public EncryptionService getQueue() {
        return this.queue;
    }

    /**
     * Set the queue property: The encryption function of the queue storage
     * service.
     * 
     * @param queue the queue value to set.
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices setQueue(EncryptionService queue) {
        this.queue = queue;
        return this;
    }
}
