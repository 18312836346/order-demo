package com.edu.soft.orderdemo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class ShopRepositoryTest {

    @Resource
    private ShopRepository shopRepository;

    @Test
    void findAll(){
        System.out.println(shopRepository.findAll());
    }
}
