package com.example.demo.client;

import com.example.demo.dto.VendorDashboardDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "OrderService")
public interface OrderClient {

    @GetMapping("/orders/vendor/dashboard/{vendorId}")
    VendorDashboardDTO getVendorDashboard(@PathVariable Long vendorId);

}