package com.vip.shop.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author LFZicoo
 * @date 2019/8/22 16:38
 */
@Data
public class Banner {
    private Integer bannerId;
    private String title;
    private String image;
    private String detailUrl;
    private Integer order;
    private Date createTime;
}
