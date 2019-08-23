package com.vip.shop.utils;

import com.vip.shop.domain.entity.Banner;
import com.vip.shop.domain.entity.Category;
import com.vip.shop.domain.entity.Navigation;
import com.vip.shop.domain.vo.CateGoryVo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/22 17:27
 */
@Data
public class CateBean implements Serializable {
    List<Banner> banners;
    List<Navigation> navigations;
    List<CateGoryVo> cateGoryVos;

}
