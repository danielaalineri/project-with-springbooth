package com.projeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
