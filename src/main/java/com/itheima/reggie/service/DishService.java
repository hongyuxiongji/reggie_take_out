package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.dto.DishDto;

import java.util.List;

public interface DishService extends IService<Dish> {
   public void saveWithFlavor(DishDto dishDto);

   public DishDto getByIdWithFlavor(Long id);

   public void updateWithFlavor(DishDto dishDto);

   public void dishOnSale(List<Long> ids);

  public void dishOffSale(List<Long> ids);
}
