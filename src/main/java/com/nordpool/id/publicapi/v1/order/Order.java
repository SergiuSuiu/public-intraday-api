/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.order;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.serialize.DateDeserializer;
import com.nordpool.id.publicapi.v1.serialize.DateSerializer;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Order {
    private String orderId;
    private String contractId;
    private Long deliveryAreaId;
    private long price;
    private long qty;
    @JsonSerialize(
            using = DateSerializer.class
    )
    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime createdAt;
    @JsonSerialize(
            using = DateSerializer.class
    )
    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime updatedAt;
    private boolean deleted;

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return price == order.price &&
                qty == order.qty &&
                deleted == order.deleted &&
                Objects.equals(orderId, order.orderId) &&
                Objects.equals(contractId, order.contractId) &&
                Objects.equals(deliveryAreaId, order.deliveryAreaId) &&
                Objects.equals(createdAt, order.createdAt) &&
                Objects.equals(updatedAt, order.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, contractId, deliveryAreaId, price, qty, createdAt, updatedAt, deleted);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", contractId='" + contractId + '\'' +
                ", deliveryAreaId=" + deliveryAreaId +
                ", price=" + price +
                ", qty=" + qty +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deleted=" + deleted +
                '}';
    }
}
