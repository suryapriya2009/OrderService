package com.suryams.orderservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.suryams.orderservice.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer> {

}
