package com.projectx.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class PaymentRequestDTO {
    private Integer userId;
    private UUID orderId;
    private Double amount;

    public PaymentRequestDTO() {
    }

    public PaymentRequestDTO(Integer userId, UUID orderId, Double amount) {
        this.userId = userId;
        this.orderId = orderId;
        this.amount = amount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
