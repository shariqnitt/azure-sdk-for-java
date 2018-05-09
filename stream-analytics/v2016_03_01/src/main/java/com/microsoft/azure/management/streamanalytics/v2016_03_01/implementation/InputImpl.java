/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation;

import com.microsoft.azure.management.streamanalytics.v2016_03_01.Input;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.InputProperties;

class InputImpl extends CreatableUpdatableImpl<Input, InputInner, InputImpl> implements Input, Input.Definition, Input.Update {
    private final StreamAnalyticsManager manager;
    private String resourceGroupName;
    private String jobName;
    private String inputName;

    InputImpl(String name, StreamAnalyticsManager manager) {
        super(name, new InputInner());
        this.manager = manager;
        // Set resource name
        this.inputName = name;
        //
    }

    InputImpl(InputInner inner, StreamAnalyticsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.inputName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        this.jobName = IdParsingUtils.getValueFromIdByName(inner.id(), "streamingjobs");
        this.inputName = IdParsingUtils.getValueFromIdByName(inner.id(), "inputs");
        //
    }

    @Override
    public StreamAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Input> createResourceAsync() {
        InputsInner client = this.manager().inner().inputs();
        return client.createOrReplaceAsync(this.resourceGroupName, this.jobName, this.inputName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Input> updateResourceAsync() {
        InputsInner client = this.manager().inner().inputs();
        return client.updateAsync(this.resourceGroupName, this.jobName, this.inputName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<InputInner> getInnerAsync() {
        InputsInner client = this.manager().inner().inputs();
        return client.getAsync(this.resourceGroupName, this.jobName, this.inputName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public InputProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public InputImpl withExistingStreamingjob(String resourceGroupName, String jobName) {
        this.resourceGroupName = resourceGroupName;
        this.jobName = jobName;
        return this;
    }

    @Override
    public InputImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public InputImpl withProperties(InputProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

}
