package com.edu.soft.orderdemo.repository;

import com.edu.soft.orderdemo.pojo.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop,Integer> {


}
