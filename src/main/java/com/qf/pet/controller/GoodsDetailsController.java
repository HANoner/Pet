package com.qf.pet.controller;

import com.qf.pet.common.util.ResultUtil;
import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.entity.GoodsDetail;
import com.qf.pet.service.GoodsDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(value = "商品展示操作" ,tags = "操作商品")
@RestController
public class GoodsDetailsController {
    @Autowired
    private GoodsDetailService goodsDetailService;
    @ApiOperation(value = "展示特价商品",notes = "实现特价优惠商品的展示")
    @GetMapping("goods/benefitlist.do")
    public ResultVO ListBenefit(){
        List<GoodsDetail> list = goodsDetailService.searchBenefit();
        return ResultUtil.exec(true,"优惠信息加载成功",list);
    }

}
