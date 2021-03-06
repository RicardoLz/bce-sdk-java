/*
 * Copyright (c) 2019 Baidu.com, Inc. All Rights Reserved
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

package com.baidubce.services.tablestorage.model.transform;

import com.baidubce.BceClientException;
import com.baidubce.model.AbstractBceResponse;
import com.baidubce.services.tablestorage.TableStorageConstants;
import com.baidubce.services.tablestorage.model.BatchGetRowResponse;
import com.baidubce.services.tablestorage.model.TableStorageResult;
import com.baidubce.util.JsonUtils;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Used to parse BatchGetRowResponse from HttpResponse body
 */
public class BatchGetRowResponseUnmarshaller implements Unmarshaller<BatchGetRowResponse, InputStream> {
    private BatchGetRowResponse result;

    /**
     * Constructs a batch get row response unmarshaller with response object.
     *
     * @param response The batch get row response object used to store unmarshalled result.
     */
    public BatchGetRowResponseUnmarshaller(AbstractBceResponse response) {
        result = (BatchGetRowResponse) response;
    }

    /**
     * Unmarshal the result of response from TableStorage.
     *
     * @param in The input stream of content to be unmarshalled.
     * @return The batch get row response object.
     * @throws Exception
     */
    @Override
    public BatchGetRowResponse unmarshall(InputStream in) throws Exception {
        String streamContents = Unmarshallers.readStreamContents(in);

        JsonNode root = JsonUtils.jsonNodeOf(streamContents);
        if (!root.isObject()) {
            throw new BceClientException("The input json object:" + root.toString() + " is not an object.");
        }

        JsonNode resultsNode = root.get(TableStorageConstants.JSON_RESULT);
        List<TableStorageResult> results = new ArrayList<TableStorageResult>();
        if (resultsNode != null) {
            Iterator<JsonNode> resultList = resultsNode.elements();
            TableStorageResultUnmarshaller unmarshaller = new TableStorageResultUnmarshaller();
            while (resultList.hasNext()) {
                JsonNode resultNode = resultList.next();
                TableStorageResult result = unmarshaller.unmarshall(resultNode);
                results.add(result);
            }
        }
        result.setResults(results);

        return result;
    }

}
