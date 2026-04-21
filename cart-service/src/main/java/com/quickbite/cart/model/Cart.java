package com.quickbite.cart.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private String userEmail;
    private Long restaurantId;
    private String restaurantName;
    private final List<CartItem> items = new ArrayList<>();

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public List<CartItem> getItems() {
        return items;
    }
}
