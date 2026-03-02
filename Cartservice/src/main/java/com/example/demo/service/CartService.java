package com.example.demo.service;

import com.example.demo.dto.*;
import com.example.demo.entity.CartItem;

import java.util.List;

public interface CartService {
    List<CartItem> getMyCart(String username);
    CartItem add(String username, CartAddRequest req);
    CartItem update(String username, CartUpdateRequest req);
    String remove(String username, CartRemoveRequest req);
}