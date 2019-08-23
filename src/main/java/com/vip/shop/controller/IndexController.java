package com.vip.shop.controller;

import com.vip.shop.service.IndexService;
import com.vip.shop.utils.CateBean;
import com.vip.shop.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LFZicoo
 * @date 2019/8/22 17:22
 */
@RestController
@RequestMapping("/api/v2")
public class IndexController {
    @Resource
    IndexService indexService;


    @GetMapping("/heads")
    public Result getHeaderData(){
        try {
            CateBean cateBean = indexService.getHeader();
            return Result.success(cateBean);
        } catch (Exception e) {
            return Result.error();
        }
    }



}
