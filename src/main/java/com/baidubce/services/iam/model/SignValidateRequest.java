/*
 * Copyright 2020 Baidu, Inc. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.iam.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SignValidateRequest {
    /**
     * method
     */
    private String method;

    /**
     * uri
     */
    private String uri;

    /**
     * params
     */
    private SignValidateRequestParams params;

    /**
     * headers
     */
    private SignValidateRequestHeaders headers;

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return this.method;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return this.uri;
    }

    public void setParams(SignValidateRequestParams params) {
        this.params = params;
    }

    public SignValidateRequestParams getParams() {
        return this.params;
    }

    public void setHeaders(SignValidateRequestHeaders headers) {
        this.headers = headers;
    }

    public SignValidateRequestHeaders getHeaders() {
        return this.headers;
    }

    @Override
    public String toString() {
        return "SignValidateRequest{"
                + "method=" + method + "\n"
                + "uri=" + uri + "\n"
                + "params=" + params + "\n"
                + "headers=" + headers + "\n"
                + "}";
    }

    public static class SignValidateRequestParams {
        @Override
        public String toString() {
            return "SignValidateRequestParams{"
                    + "}";
        }
    }

    public static class SignValidateRequestHeaders {
        @Override
        public String toString() {
            return "SignValidateRequestHeaders{"
                    + "}";
        }
    }

}