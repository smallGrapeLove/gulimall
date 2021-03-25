package com.xuhuan.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuhuan.common.utils.PageUtils;
import com.xuhuan.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author xuhuan
 * @email momo_xh0817@163.com
 * @date 2021-03-25 21:05:31
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

