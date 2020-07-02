/*
 * Copyright 2019 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.dugo.video;

import java.util.Date;

import com.baidubce.services.dugo.AbstractDuGoRequest;
import com.baidubce.services.dugo.video.model.DataType;
import com.baidubce.services.dugo.video.model.StorageType;
import com.baidubce.services.dugo.video.model.StreamType;
import com.baidubce.services.dugo.video.model.VideoType;

/**
 * playback request
 *
 * @Author: shihuike
 * @Date: Created in 2019-08-01 16:12
 */
public class PlaybackRequest extends AbstractDuGoRequest {
    private String videoType = VideoType.FLV.name(); // 音视频实时流传输格式
    private String fileName;

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
