/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.devicefarm.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DevicePoolCompatibilityResultMarshaller
 */
public class DevicePoolCompatibilityResultJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(
            DevicePoolCompatibilityResult devicePoolCompatibilityResult,
            JSONWriter jsonWriter) {
        if (devicePoolCompatibilityResult == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (devicePoolCompatibilityResult.getDevice() != null) {
                jsonWriter.key("device");
                DeviceJsonMarshaller.getInstance().marshall(
                        devicePoolCompatibilityResult.getDevice(), jsonWriter);
            }

            if (devicePoolCompatibilityResult.getCompatible() != null) {
                jsonWriter.key("compatible").value(
                        devicePoolCompatibilityResult.getCompatible());
            }

            java.util.List<IncompatibilityMessage> incompatibilityMessagesList = devicePoolCompatibilityResult
                    .getIncompatibilityMessages();
            if (incompatibilityMessagesList != null) {
                jsonWriter.key("incompatibilityMessages");
                jsonWriter.array();
                for (IncompatibilityMessage incompatibilityMessagesListValue : incompatibilityMessagesList) {
                    if (incompatibilityMessagesListValue != null) {

                        IncompatibilityMessageJsonMarshaller.getInstance()
                                .marshall(incompatibilityMessagesListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DevicePoolCompatibilityResultJsonMarshaller instance;

    public static DevicePoolCompatibilityResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DevicePoolCompatibilityResultJsonMarshaller();
        return instance;
    }

}
