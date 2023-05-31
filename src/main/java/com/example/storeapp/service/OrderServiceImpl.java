package com.example.storeapp.service;

import com.example.storeapp.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> ids) {
        return cart.addItems(ids);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
