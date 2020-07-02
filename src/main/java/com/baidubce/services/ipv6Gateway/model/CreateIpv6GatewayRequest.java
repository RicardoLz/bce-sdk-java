/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce.services.ipv6Gateway.model;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The request for creating a newly Ipv6Gateway.
 */
public class CreateIpv6GatewayRequest extends AbstractBceRequest {

    /**
     * An ASCII string whose length is less than 64.
     * <p>
     * The request will be idempotent if clientToken is provided.
     * If the clientToken is not specified by the user, a random String generated by default algorithm will be used.
     * See more detail at
     * <a href = "https://bce.baidu.com/doc/BCC/API.html#.E5.B9.82.E7.AD.89.E6.80.A7">
     * BCE API doc</a>
     */
    @JsonIgnore
    private String clientToken;

    /**
     * The name of Ipv6Gateway that will be created.
     */
    private String name;

    /**
     * The vpcId of this Ipv6Gateway belong.
     */
    private String vpcId;

    /**
     * The bandwidthInMbps of Ipv6Gateway that will be created.
     */
    private int bandwidthInMbps;

    private Billing billing;

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * Configure request credential for the request.
     *
     * @param credentials a valid instance of BceCredentials.
     *
     * @return CreateIpv6GatewayRequest with credentials.
     */
    public CreateIpv6GatewayRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }

    /**
     * Configure name for the request.
     *
     * @param name The name of vpc
     *
     * @return CreateIpv6GatewayRequest with specific name
     */
    public CreateIpv6GatewayRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Configure vpcId for the request.
     *
     * @param vpcId the vpcId of Ipv6Gateway
     *
     * @return CreateIpv6GatewayRequest with vpcId
     */
    public CreateIpv6GatewayRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Configure bandwidthInMbps for the request.
     *
     * @param bandwidthInMbps the bandwidthInMbps of Ipv6Gateway
     *
     * @return CreateIpv6GatewayRequest with bandwidthInMbps
     */
    public CreateIpv6GatewayRequest withBandwith(int bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    /**
     * Configure bandwidthInMbps for the request.
     *
     * @param billing the Billing of Ipv6Gateway
     *
     * @return CreateIpv6GatewayRequest with billing
     */
    public CreateIpv6GatewayRequest withBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public int getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public void setBandwidthInMbps(int bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }


}
