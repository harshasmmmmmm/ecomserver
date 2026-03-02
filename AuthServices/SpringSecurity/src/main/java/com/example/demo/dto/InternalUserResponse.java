package com.example.demo.dto;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class InternalUserResponse {
    private Long userId;
    private String username;
    private String role; // CUSTOMER / VENDOR / ADMIN
}