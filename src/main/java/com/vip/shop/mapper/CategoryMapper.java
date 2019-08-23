package com.vip.shop.mapper;

import com.vip.shop.domain.vo.CateGoryVo;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/22 17:57
 */
public interface CategoryMapper {
    List<CateGoryVo> findAll();

    List<CateGoryVo> findAllShop();
}
