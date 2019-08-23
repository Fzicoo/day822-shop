package com.vip.shop.service.impl;

import com.vip.shop.domain.entity.Banner;
import com.vip.shop.domain.entity.Navigation;
import com.vip.shop.domain.vo.CateGoryVo;
import com.vip.shop.mapper.BannerMapper;
import com.vip.shop.mapper.CategoryMapper;
import com.vip.shop.mapper.NavigationMapper;
import com.vip.shop.service.IndexService;
import com.vip.shop.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/22 19:50
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {

    @Resource
    BannerMapper bannerMapper;
    @Resource
    CategoryMapper categoryMapper;
    @Resource
    NavigationMapper navigationMapper;

    @Override
    public CateBean getHeader() {
        CateBean cateBean = new CateBean();
        List<Banner> banners = bannerMapper.findAll("order");
        List<Navigation> navigations = navigationMapper.findNavigations();
        List<CateGoryVo> cateGoryVos = categoryMapper.findAll();
        List<CateGoryVo> cateGoryVos1 = categoryMapper.findAllShop();
        cateBean.setBanners(banners);
        cateBean.setNavigations(navigations);
        cateBean.setCateGoryVos(cateGoryVos);
        cateBean.setCateGoryVos(cateGoryVos1);
        return cateBean;
    }


}
