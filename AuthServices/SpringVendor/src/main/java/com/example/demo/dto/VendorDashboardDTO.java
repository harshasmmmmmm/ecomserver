package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VendorDashboardDTO {

    private Long vendorId;
    private int totalProductsSold;
    private int totalOrders;
}