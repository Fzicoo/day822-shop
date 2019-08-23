package com.vip.shop.domain.vo;

import com.vip.shop.domain.entity.Category;
import com.vip.shop.domain.entity.Shop;
import com.vip.shop.domain.entity.SubMenu;
import lombok.Data;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/22 17:37
 */
@Data
public class CateGoryVo extends Category {
    List<SubMenuVo> subMenuList;

    List<Shop> shopList;
}
