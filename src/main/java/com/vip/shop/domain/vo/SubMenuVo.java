package com.vip.shop.domain.vo;

import com.vip.shop.domain.entity.SubMenu;
import com.vip.shop.domain.entity.SubMenu1;
import lombok.Data;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/22 17:40
 */
@Data
public class SubMenuVo extends SubMenu {
    List<SubMenu1> subMenu1List;
}
