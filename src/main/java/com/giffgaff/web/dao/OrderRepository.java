package com.giffgaff.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giffgaff.web.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
