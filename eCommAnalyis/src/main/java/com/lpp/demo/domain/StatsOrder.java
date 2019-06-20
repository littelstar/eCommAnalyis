package com.lpp.demo.domain;

import java.util.Date;

public class StatsOrder {
    private int platformDimensionId;
    private int dateDimensionId;
    private int currencyTypeDimensionId;
    private int paymentTypeDimensionId;
    private int orders;//订单个数
    private int successOrders;//成功支付的订单个数
    private int refundOrders;//退款给的订单个数
    private int orderAmount;//订单交易额
    private int revenueAmount;//支付成功的交易额
    private int refundAmount;//退款的金额
    private int totalRevenueAmount;//迄今总金额
    private int totalRefundAmount;//迄今总的退款金额
    private Date date;

    public StatsOrder(int orders, int successOrders, int refundOrders, int orderAmount, int revenueAmount, int refundAmount, int totalRevenueAmount, int totalRefundAmount) {
        this.orders = orders;
        this.successOrders = successOrders;
        this.refundOrders = refundOrders;
        this.orderAmount = orderAmount;
        this.revenueAmount = revenueAmount;
        this.refundAmount = refundAmount;
        this.totalRevenueAmount = totalRevenueAmount;
        this.totalRefundAmount = totalRefundAmount;
    }

    public int getPlatformDimensionId() {
        return platformDimensionId;
    }

    public void setPlatformDimensionId(int platformDimensionId) {
        this.platformDimensionId = platformDimensionId;
    }

    public int getDateDimensionId() {
        return dateDimensionId;
    }

    public void setDateDimensionId(int dateDimensionId) {
        this.dateDimensionId = dateDimensionId;
    }

    public int getCurrencyTypeDimensionId() {
        return currencyTypeDimensionId;
    }

    public void setCurrencyTypeDimensionId(int currencyTypeDimensionId) {
        this.currencyTypeDimensionId = currencyTypeDimensionId;
    }

    public int getPaymentTypeDimensionId() {
        return paymentTypeDimensionId;
    }

    public void setPaymentTypeDimensionId(int paymentTypeDimensionId) {
        this.paymentTypeDimensionId = paymentTypeDimensionId;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public int getSuccessOrders() {
        return successOrders;
    }

    public void setSuccessOrders(int successOrders) {
        this.successOrders = successOrders;
    }

    public int getRefundOrders() {
        return refundOrders;
    }

    public void setRefundOrders(int refundOrders) {
        this.refundOrders = refundOrders;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getRevenueAmount() {
        return revenueAmount;
    }

    public void setRevenueAmount(int revenueAmount) {
        this.revenueAmount = revenueAmount;
    }

    public int getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(int refundAmount) {
        this.refundAmount = refundAmount;
    }

    public int getTotalRevenueAmount() {
        return totalRevenueAmount;
    }

    public void setTotalRevenueAmount(int totalRevenueAmount) {
        this.totalRevenueAmount = totalRevenueAmount;
    }

    public int getTotalRefundAmount() {
        return totalRefundAmount;
    }

    public void setTotalRefundAmount(int totalRefundAmount) {
        this.totalRefundAmount = totalRefundAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
