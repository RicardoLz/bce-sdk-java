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
package com.baidubce.services.billing.model.order;

import java.math.BigDecimal;

import lombok.Data;
import lombok.ToString;

/**
 * the model of finance amount
 */
@Data
@ToString
public class Fee {

    /**
     * the total price
     **/
    private BigDecimal price;

    /**
     * the  amount of cash
     **/
    private BigDecimal cash;

    /**
     * the  amount of coupon
     **/
    private BigDecimal coupon;

    /**
     * the amount of discount vouchers
     **/
    private BigDecimal discountCoupon;

    /**
     * the amount of discount
     **/
    private BigDecimal discountAmount;

    /**
     * the amount of cash paid by agent
     **/
    private BigDecimal agentCash;

    /**
     * the amount of rebate paid by agent
     **/
    private BigDecimal agentRebateIn;

    /**
     * the amount of cash equivalents
     */
    private BigDecimal cashEquivalents;

    /**
     * the amount of cash to refund
     */
    private BigDecimal refundCash;

    /**
     * the amount of coupon to refund
     */
    private BigDecimal refundCoupon;

    /**
     * the catalog price
     */
    private BigDecimal catalogPrice;

    /**
     * the alter price
     */
    private BigDecimal alterPrice;

}
