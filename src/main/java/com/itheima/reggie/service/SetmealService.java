package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;

import java.util.List;


public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);
    public void  removeWithDish(List<Long> ids);

    public void setmealOffSale(List<Long> ids);

    public void setmealOnSale(List<Long> ids);

    public SetmealDto getByIdwithSetmeal(Long id);

    public void updateWithDishes(SetmealDto setmealDto);
}
