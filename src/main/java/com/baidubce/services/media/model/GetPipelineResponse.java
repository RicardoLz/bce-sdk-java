/*
 * Copyright 2015-2020 Baidu, Inc.
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

package com.baidubce.services.media.model;

import com.baidubce.model.AbstractBceResponse;

/**
 * The response for getting pipeline
 */
public class GetPipelineResponse extends AbstractBceResponse {
    private String pipelineName   = null;
    private String description    = null;
    private String sourceBucket   = null;
    private String targetBucket   = null;
    private PipelineConfig config = null;
    private String state          = null;
    private String lastUpdateTime = null;
    private JobStatus jobStatus      = null;

    public PipelineStatus getPipeline() {
        PipelineStatus pipeline =  new PipelineStatus();
        pipeline.setPipelineName(pipelineName);
        pipeline.setDescription(description);
        pipeline.setSourceBucket(sourceBucket);
        pipeline.setTargetBucket(targetBucket);
        pipeline.setConfig(config);
        return pipeline;
    }
    /**
     * 系统生成的队列唯一标示
     **/
    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * 用户指定的队列描述
     **/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 用户指定的输入Bucket
     **/
    public String getSourceBucket() {
        return sourceBucket;
    }

    public void setSourceBucket(String sourceBucket) {
        this.sourceBucket = sourceBucket;
    }

    /**
     * 用户指定的输出Bucket
     **/
    public String getTargetBucket() {
        return targetBucket;
    }

    public void setTargetBucket(String targetBucket) {
        this.targetBucket = targetBucket;
    }

    /**
     * pipeline的的配置
     **/
    public PipelineConfig getConfig() {
        return config;
    }

    public void setConfig(PipelineConfig config) {
        this.config = config;
    }

    /**
     **/
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 最后更新时间
     **/
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 队列中任务的状态集合
     **/
    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPipelineResponse {\n");

        sb.append("    pipelineName: ").append(pipelineName).append("\n");
        sb.append("    description: ").append(description).append("\n");
        sb.append("    sourceBucket: ").append(sourceBucket).append("\n");
        sb.append("    targetBucket: ").append(targetBucket).append("\n");
        sb.append("    config: ").append(config).append("\n");
        sb.append("    state: ").append(state).append("\n");
        sb.append("    lastUpdateTime: ").append(lastUpdateTime).append("\n");
        sb.append("    jobStatus: ").append(jobStatus).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
