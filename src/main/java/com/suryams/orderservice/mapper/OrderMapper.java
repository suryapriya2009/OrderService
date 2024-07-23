package com.suryams.orderservice.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.suryams.orderservice.dto.OrderDTO;
import com.suryams.orderservice.entity.Order;
@Mapper
public interface OrderMapper {
	OrderMapper INSTANCE= Mappers.getMapper(OrderMapper.class);
	Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrderToOrderDTO(Order order);
}
