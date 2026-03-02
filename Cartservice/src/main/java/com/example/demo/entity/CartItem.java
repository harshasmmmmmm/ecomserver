package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "cart_items",
       uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "product_id"}))
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItemId;

    @Column(name = "user_id", nullable = false)
    private Long userId;          // from SpringSecurity service

    @Column(name = "product_id", nullable = false)
    private Long productId;       // from product-service

    @Column(nullable = false)
    private Integer quantity;
}