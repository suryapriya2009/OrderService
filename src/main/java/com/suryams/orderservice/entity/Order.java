package com.suryams.orderservice.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.suryams.orderservice.dto.FoodItemsDTO;
import com.suryams.orderservice.dto.Restaurant;
import com.suryams.orderservice.dto.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {
    private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;

}
