package com.example.demo.dto;

import com.example.demo.entity.OrderStatus;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class OrderResponse {
    private Long orderId;
    private Long userId;
    private Long productId;
    private Integer quantity;
    private BigDecimal orderValue;
    private OrderStatus orderStatus;
    private boolean paid;
    private LocalDateTime orderDate;
    private Long vendorId;
    private String productName;

}