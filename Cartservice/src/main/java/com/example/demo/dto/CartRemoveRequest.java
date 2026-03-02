package com.example.demo.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CartRemoveRequest {
    @NotNull
    private Long productId;
}