package com.vip.shop.mapper;

import com.vip.shop.domain.entity.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/22 17:58
 */
public interface BannerMapper {
    List<Banner> findAll(@Param("ord") String ord);
}
