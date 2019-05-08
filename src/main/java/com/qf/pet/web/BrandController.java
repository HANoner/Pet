package com.qf.pet.web;

import com.qf.pet.common.util.ResultUtil;
import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.entity.Brand;
import com.qf.pet.service.BrandService;
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
@Api(value = "品牌操作",tags = "品牌相关操作")
public class BrandController {
    @Autowired
    private BrandService brandService;
    //展示所有品牌信息
    @ApiOperation(value = "品牌信息展示",notes = "实现展示品牌信息")
    @GetMapping("brand/list.do")
    public ResultVO brandList(){
        List<Brand> list = brandService.searchAllBrand();
        return ResultUtil.exec(true,"品牌信息展示成功",list);
    }
	
}
