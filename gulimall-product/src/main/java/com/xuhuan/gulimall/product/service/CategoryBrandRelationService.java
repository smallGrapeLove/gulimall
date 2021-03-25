package com.xuhuan.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuhuan.common.utils.PageUtils;
import com.xuhuan.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author xuhuan
 * @email momo_xh0817@163.com
 * @date 2021-03-25 12:13:02
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

