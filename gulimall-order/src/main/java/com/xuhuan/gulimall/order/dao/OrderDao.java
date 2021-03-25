package com.xuhuan.gulimall.order.dao;

import com.xuhuan.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xuhuan
 * @email momo_xh0817@163.com
 * @date 2021-03-25 21:07:27
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
