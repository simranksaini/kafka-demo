package com.projectx.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class OrchestratorRequestDTO {

    private Integer userId;
    private Integer productId;
    private UUID orderId;
    private Double amount;


    public OrchestratorRequestDTO() {
    }

    public OrchestratorRequestDTO(Integer userId, Integer productId, UUID orderId, Double amount) {
        this.userId = userId;
        this.productId = productId;
        this.orderId = orderId;
        this.amount = amount;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
