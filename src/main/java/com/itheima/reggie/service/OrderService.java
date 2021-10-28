package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Orders;

import java.util.List;


public interface OrderService extends IService<Orders> {
    public void submit(Orders orders);


    public List orderHistory(List list);

}
