package com.qf.pet.web;

import com.qf.pet.common.util.ResultUtil;
import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.entity.GoodsDetail;
import com.qf.pet.service.GoodsDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
@RestController
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


    @ApiOperation(value = "相应类型商品展示",notes = "实现相应类型商品展示")
    @GetMapping("goods/findByTypeId.do")
    public ResultVO findByTypeId(@ApiParam(value = "传入类型id" ) @RequestParam("tid") int tid){
        List<GoodsDetail> list = goodsDetailService.searchByTypeId(tid);
        return ResultUtil.exec(true,"相应类型商品查询完毕",list);
    }
    @ApiOperation(value = "模糊查询商品",notes = "实现模糊查询商品展示")
    @GetMapping("goods/findByName.do")
    public ResultVO findByGoodsName(@ApiParam(value = "传入模糊的商品名字" ) @RequestParam("goodsName") String goodsName){
        List<GoodsDetail> list = goodsDetailService.searchByName(goodsName);
        return ResultUtil.exec(true,"相应类型商品查询完毕",list);
    }

    @ApiOperation(value = "根据商品id查找商品",notes = "在页面点击商品图片进行详细信息页面跳转")
    @GetMapping("goods/findByGoodsId.do")
    public ResultVO findByGoodsId(@ApiParam(value = "传入商品id" ) @RequestParam("id") int id){
        GoodsDetail goodsDetail = goodsDetailService.searchByGoodsId(id);
        return ResultUtil.exec(true,"相应类型商品查询完毕",goodsDetail);
    }

}
