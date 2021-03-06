/*
 * Copyright  2019 Baidu, Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.cfc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response object for invoking a Baidu CFC function
 */
public class GetInvokeResponse extends CfcResponse {

    /**
     * Represent the invoke result
     */
    @JsonProperty(value = "Invoke")
    private CfcInvokeResult Invoke;

    /**
     * Get the invoke result
     * @return The invoke result
     */
    public CfcInvokeResult getInvoke() {
        return Invoke;
    }

    /**
     * Set the invoke result
     * @param invoke The invoke result
     */
    public void setInvoke(CfcInvokeResult invoke) {
        Invoke = invoke;
    }
}
