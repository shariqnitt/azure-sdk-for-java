/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation.StreamingJobsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Streamingjobs.
 */
public interface Streamingjobs extends SupportsCreating<StreamingJob.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<StreamingJob>, SupportsListingByResourceGroup<StreamingJob>, SupportsListing<StreamingJob>, HasInner<StreamingJobsInner> {

    /**
     * @return Entry point to manage Streamingjob Input.
     */
    Inputs inputs();

    /**
     * @return Entry point to manage Streamingjob Output.
     */
    Outputs outputs();

    /**
     * @return Entry point to manage Streamingjob Transformation.
     */
    Transformations transformations();

    /**
     * @return Entry point to manage Streamingjob Function.
     */
    Functions functions();
    /**
     * Starts a streaming job. Once a job is started it will start processing input events and produce output.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param jobName The name of the streaming job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable startAsync(String resourceGroupName, String jobName);

    /**
     * Stops a running streaming job. This will cause a running streaming job to stop processing input events and producing output.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param jobName The name of the streaming job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable stopAsync(String resourceGroupName, String jobName);

}
