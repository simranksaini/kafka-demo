package com.projectx.dto;

import lombok.*;

import java.util.UUID;

@Data
public class InventoryRequestDTO {

    private Integer userId;
    private Integer productId;
    private UUID orderId;

    public InventoryRequestDTO() {
    }

    public InventoryRequestDTO(Integer userId, Integer productId, UUID orderId) {
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
