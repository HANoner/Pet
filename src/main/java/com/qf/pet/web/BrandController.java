package com.qf.pet.web;

import com.qf.pet.common.util.ResultUtil;
import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.entity.Brand;
import com.qf.pet.service.BrandService;
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
 * @since 2019-05-04
 */
@RestController
@Api(value = "品牌操作",tags = "品牌相关操作")
public class BrandController {
    @Autowired
    private BrandService brandService;
    //展示所有品牌信息
    @ApiOperation(value = "推荐品牌信息展示",notes = "实现展示推荐品牌信息")
    @GetMapping("brand/list.do")
    public ResultVO brandList(){
        List<Brand> list = brandService.searchAllBrand(12);
        return ResultUtil.exec(true,"品牌信息展示成功",list);
    }

    //主粮品牌展示
    @ApiOperation(value = "主粮品牌信息展示",notes = "实现展示主粮品牌信息")
    @GetMapping("brand/staplelist.do")
    public ResultVO StapleList(){
        List<Brand> list = brandService.searchStaple(12,6);
        return ResultUtil.exec(true,"主粮品牌信息展示成功",list);
    }
	
}
