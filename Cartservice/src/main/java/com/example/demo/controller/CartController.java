package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.entity.CartItem;
import com.example.demo.service.CartService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/my")
    public List<CartItem> myCart(Authentication auth) {
        return cartService.getMyCart(auth.getName());
    }

    @PostMapping("/add")
    public CartItem add(Authentication auth, @Valid @RequestBody CartAddRequest req) {
        return cartService.add(auth.getName(), req);
    }

    @PutMapping("/update")
    public CartItem update(Authentication auth, @Valid @RequestBody CartUpdateRequest req) {
        return cartService.update(auth.getName(), req);
    }

    @DeleteMapping("/remove")
    public String remove(Authentication auth, @RequestBody CartRemoveRequest req) {
        return cartService.remove(auth.getName(), req);
    }
}