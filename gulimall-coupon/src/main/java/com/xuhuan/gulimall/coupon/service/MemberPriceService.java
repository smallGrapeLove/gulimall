package com.xuhuan.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuhuan.common.utils.PageUtils;
import com.xuhuan.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author xuhuan
 * @email momo_xh0817@163.com
 * @date 2021-03-25 21:00:19
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

