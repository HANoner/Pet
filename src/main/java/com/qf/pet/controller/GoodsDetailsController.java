package com.qf.pet.controller;

import com.qf.pet.common.util.ResultUtil;
import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.entity.GoodsDetail;
import com.qf.pet.service.GoodsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsDetailsController {
    @Autowired
    private GoodsDetailService goodsDetailService;
    @GetMapping("goods/benefitlist.do")
    public ResultVO ListBenefit(){
        List<GoodsDetail> list = goodsDetailService.searchBenefit();
        return ResultUtil.exec(true,"优惠信息加载成功",list);
    }
}
