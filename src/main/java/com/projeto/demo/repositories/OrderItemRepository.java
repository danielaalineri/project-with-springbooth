package com.projeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.projeto.demo.entities.OrderItem;
import com.projeto.demo.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
