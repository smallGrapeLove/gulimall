package com.xuhuan.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuhuan.common.utils.PageUtils;
import com.xuhuan.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author xuhuan
 * @email momo_xh0817@163.com
 * @date 2021-03-25 12:13:02
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

