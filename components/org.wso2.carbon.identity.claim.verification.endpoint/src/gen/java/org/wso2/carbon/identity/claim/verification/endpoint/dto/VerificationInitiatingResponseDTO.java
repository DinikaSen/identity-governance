/*
 *  Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.carbon.identity.claim.verification.endpoint.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
public class VerificationInitiatingResponseDTO {

    private String code = null;
    private LinkDTO link = null;

    /**
     * Confirmation code related to the claim verification request.
     **/
    @ApiModelProperty(value = "Confirmation code related to the claim verification request.")
    @JsonProperty("code")
    public String getCode() {

        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    @ApiModelProperty(value = "")
    @JsonProperty("link")
    public LinkDTO getLink() {

        return link;
    }

    public void setLink(LinkDTO link) {

        this.link = link;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class VerificationInitiatingResponseDTO {\n");

        sb.append("  code: ").append(code).append("\n");
        sb.append("  link: ").append(link).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
