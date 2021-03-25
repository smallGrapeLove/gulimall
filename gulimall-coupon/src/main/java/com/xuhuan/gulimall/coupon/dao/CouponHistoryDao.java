package com.xuhuan.gulimall.coupon.dao;

import com.xuhuan.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author xuhuan
 * @email momo_xh0817@163.com
 * @date 2021-03-25 21:00:19
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
