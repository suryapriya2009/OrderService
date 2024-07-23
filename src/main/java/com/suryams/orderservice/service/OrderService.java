package com.suryams.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.suryams.orderservice.dto.OrderDTO;
import com.suryams.orderservice.dto.OrderDTOFromFE;
import com.suryams.orderservice.dto.UserDTO;
import com.suryams.orderservice.entity.Order;
import com.suryams.orderservice.mapper.OrderMapper;
import com.suryams.orderservice.repo.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	SequenceGenerator sequenceGenerator;
	
	@Autowired 
	RestTemplate restTemplate;
	
	public OrderDTO saveOrderInDB(OrderDTOFromFE orderDetails) {
		Integer newOrderID = sequenceGenerator.generateNextOrderId();
	//	UserDTO userDTO =null;
		UserDTO userDTO =fetchUserDetailsFromUserId(orderDetails.getUserId());
		Order orderToSave= new Order(newOrderID,orderDetails.getFoodItemsList(),orderDetails.getRestaurant(),userDTO);
		orderRepository.save(orderToSave);
		return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToSave);
		
	}

	private UserDTO fetchUserDetailsFromUserId(Integer userId) {
		return restTemplate.getForObject("http://USERINFORMATIONSERVICE/user/fetchUserById/"+userId, UserDTO.class);
	}

}
