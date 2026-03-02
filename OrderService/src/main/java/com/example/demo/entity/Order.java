package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(name = "user_id", nullable = false)
    private Long userId;                 // ✅ from SpringSecurity internal lookup

    @Column(name = "product_id", nullable = false)
    private Long productId;              // ✅ from Product service

    @Column(nullable = false)
    private Integer quantity;

    @Column(name = "order_value", nullable = false, precision = 12, scale = 2)
    private BigDecimal orderValue;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Column(nullable = false)
    private boolean paid = false;        // for now (payment-service will update later)

    @Column(nullable = false)
    private LocalDateTime orderDate;
}