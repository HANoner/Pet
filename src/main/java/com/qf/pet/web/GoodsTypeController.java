package com.qf.pet.web;

import com.qf.pet.common.util.ResultUtil;
import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.service.GoodsTypeService;
import com.qf.pet.vo.VGoodsType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wsy
 * @since 2019-05-09
 */
@RestController
@Api(value = "商品类型",tags = "商品类型展示")
public class GoodsTypeController {
    @Autowired
    private GoodsTypeService goodsTypeService;
    @ApiOperation(value = "猫猫商品类型展示",notes = "实现猫猫商品类型展示")
    @GetMapping("/type/catTypelist.do")
    public ResultVO ListCatType(){
        List<VGoodsType> list = goodsTypeService.searchType();
        return ResultUtil.exec(true,"猫猫商品类型查询完毕",list);
    }
	
}
