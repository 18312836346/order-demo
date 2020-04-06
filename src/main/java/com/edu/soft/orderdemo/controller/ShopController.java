package com.edu.soft.orderdemo.controller;

import com.edu.soft.orderdemo.pojo.Shop;
import com.edu.soft.orderdemo.repository.ShopRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/shop")
public class ShopController {

    @Resource
    private ShopRepository shopRepository;

    //查询

    @GetMapping("/findAll/{page}/{size}")
    public Page<Shop> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        return shopRepository.findAll(request);
    }

    //增加

    @PostMapping("/save")
    public String save(@RequestBody Shop shopping){
        Shop result = shopRepository.save(shopping);
        if (result != null){
            return "success";
        }else {
            return "error";
        }
    }

//    修改

    @PutMapping("/update")
    public String update(@RequestBody Shop shopping){
        Shop result = shopRepository.save(shopping);
        if (result != null){
            return "success";
        }else {
            return "error";
        }
    }

    //删除

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") Integer id){
        shopRepository.deleteById(id);
    }



}
