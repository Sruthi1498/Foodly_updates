package com.example.foodly.model


data class OrderHistoryRestaurant(
    var orderId: String,
    var restaurantName: String,
    var totalCost: String,
    var orderPlacedAt: String
)