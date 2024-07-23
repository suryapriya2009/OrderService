package com.suryams.orderservice.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;
}