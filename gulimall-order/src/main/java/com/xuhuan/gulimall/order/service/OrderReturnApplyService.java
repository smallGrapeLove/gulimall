package com.xuhuan.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuhuan.common.utils.PageUtils;
import com.xuhuan.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author xuhuan
 * @email momo_xh0817@163.com
 * @date 2021-03-25 21:07:27
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

