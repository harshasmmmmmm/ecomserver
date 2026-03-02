package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@FeignClient(name = "order-service", url = "${services.order}")
public interface OrderClient {

    @GetMapping("/orders/internal/{orderId}")
    InternalOrderDTO getInternal(@PathVariable("orderId") Long orderId);

    @PutMapping("/orders/{orderId}/internal/markPaid")
    String markPaid(@PathVariable("orderId") Long orderId);

    class InternalOrderDTO {
        public Long orderId;
        public Long userId;
        public BigDecimal orderValue;
        public boolean paid;
        public String orderStatus;
    }
}