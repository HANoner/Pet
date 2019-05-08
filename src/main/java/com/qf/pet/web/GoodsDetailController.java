package com.qf.pet.web;

import com.qf.pet.common.util.ResultUtil;
import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.entity.GoodsDetail;
import com.qf.pet.service.GoodsDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
@Controller
@Api(value = "商品展示操作" ,tags = "操作商品")
public class GoodsDetailController {
    @Autowired
    private GoodsDetailService goodsDetailService;
    @ApiOperation(value = "展示特价商品",notes = "实现特价优惠商品的展示")
    @GetMapping("goods/benefitlist.do")
    public ResultVO ListBenefit(){
        List<GoodsDetail> list = goodsDetailService.searchBenefit();
        return ResultUtil.exec(true,"优惠信息加载成功",list);
    }
    @ApiOperation(value = "展示新品商品",notes = "实现新品上架商品的展示")
    @GetMapping("goods/newgoodslist.do")
    public ResultVO ListNewGoods(){
        List<GoodsDetail> list = goodsDetailService.searchNewGoods();
        return ResultUtil.exec(true,"新品商品查询完毕",list);
    }
	
}
