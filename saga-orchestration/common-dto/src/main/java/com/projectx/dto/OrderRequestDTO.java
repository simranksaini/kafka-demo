package com.projectx.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class OrderRequestDTO {

    private Integer userId;
    private Integer productId;
    private UUID orderId;

    public OrderRequestDTO() {
    }

    public OrderRequestDTO(Integer userId, Integer productId, UUID orderId) {
        this.userId = userId;
        this.productId = productId;
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }
}