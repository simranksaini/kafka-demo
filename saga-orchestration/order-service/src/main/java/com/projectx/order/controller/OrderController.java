package com.projectx.order.controller;

import com.projectx.dto.OrderRequestDTO;
import com.projectx.dto.OrderResponseDTO;
import com.projectx.order.entity.PurchaseOrder;
import com.projectx.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/create")
    public PurchaseOrder createOrder(@RequestBody OrderRequestDTO requestDTO){
        requestDTO.setOrderId(UUID.randomUUID());
        return this.service.createOrder(requestDTO);
    }

    @GetMapping("/all")
    public List<OrderResponseDTO> getOrders(){
        return this.service.getAll();
    }

}
