/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object detected in an image.
 */
public class DetectedObject {
    /**
     * Approximate location of the detected object.
     */
    @JsonProperty(value = "rectangle", access = JsonProperty.Access.WRITE_ONLY)
    private BoundingRect rectangle;

    /**
     * Label for the object.
     */
    @JsonProperty(value = "object")
    private String objectProperty;

    /**
     * Confidence score of having observed the object in the image, as a value
     * ranging from 0 to 1.
     */
    @JsonProperty(value = "confidence")
    private double confidence;

    /**
     * The parent object, from a taxonomy perspective.
     * The parent object is a more generic form of this object.  For example, a
     * 'bulldog' would have a parent of 'dog'.
     */
    @JsonProperty(value = "parent")
    private ObjectHierarchy parent;

    /**
     * Get the rectangle value.
     *
     * @return the rectangle value
     */
    public BoundingRect rectangle() {
        return this.rectangle;
    }

    /**
     * Get the objectProperty value.
     *
     * @return the objectProperty value
     */
    public String objectProperty() {
        return this.objectProperty;
    }

    /**
     * Set the objectProperty value.
     *
     * @param objectProperty the objectProperty value to set
     * @return the DetectedObject object itself.
     */
    public DetectedObject withObjectProperty(String objectProperty) {
        this.objectProperty = objectProperty;
        return this;
    }

    /**
     * Get the confidence value.
     *
     * @return the confidence value
     */
    public double confidence() {
        return this.confidence;
    }

    /**
     * Set the confidence value.
     *
     * @param confidence the confidence value to set
     * @return the DetectedObject object itself.
     */
    public DetectedObject withConfidence(double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the parent value.
     *
     * @return the parent value
     */
    public ObjectHierarchy parent() {
        return this.parent;
    }

    /**
     * Set the parent value.
     *
     * @param parent the parent value to set
     * @return the DetectedObject object itself.
     */
    public DetectedObject withParent(ObjectHierarchy parent) {
        this.parent = parent;
        return this;
    }

}
