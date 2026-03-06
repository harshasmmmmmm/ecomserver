package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@FeignClient(name = "product-service", url = "${services.product}")
public interface ProductClient {

    @GetMapping("/products/internal/{id}")
    ProductInternalDTO getInternal(@PathVariable("id") Long id);

    class ProductInternalDTO {
        public Long productId;
        public String productName;
        public BigDecimal price;
        public boolean active;
        public Long vendorId; 
    }
}