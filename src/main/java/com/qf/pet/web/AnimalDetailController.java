package com.qf.pet.web;

import com.qf.pet.common.util.ResultUtil;
import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.entity.AnimalDetail;
import com.qf.pet.mapper.AnimalDetailDao;
import com.qf.pet.service.AnimalDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/animalDetail")
@Api(value = "宠物的相关操作",tags = "操作宠物")
public class AnimalDetailController {
	@Autowired
    private AnimalDetailService animalDetailService;

	@Autowired
    private AnimalDetailDao animalDetailDao;

	@GetMapping("doglist.do")
    @ApiOperation(value = "首页的五条dog信息展示",notes = "实现dog的展示")
    public ResultVO findAllDog (){
	    return animalDetailService.findAllDog();

    }

    @GetMapping("catlist.do")
    @ApiOperation(value = "首页的五条cat信息展示",notes = "实现cat的展示")
    public ResultVO findFiveCat(){
        return animalDetailService.findFiveCat();
    }
    @GetMapping("alllist.do")
    @ApiOperation(value = "首页下面的更多萌宠连接展示内容",notes = "展示了10条数据  --》更多萌宠")
    public ResultVO findAll(){
        return animalDetailService.findAll();

    }

    @GetMapping("selectone.do")
    @ApiOperation(value = "萌宠下面的宠物详情",notes = "更多萌宠 -》萌宠 -》点击某一个具体信息")
    public ResultVO selectone(@ApiParam(name = "animalDetail",value = "宠物的id") int id){
        AnimalDetail animalDetail = animalDetailDao.selectById(id);
        return ResultUtil.exec(animalDetail!= null,"宠物详情",animalDetail);
    }
    //分类狗狗列表
    @GetMapping("dogclassselect.do")
    @ApiOperation(value = "狗狗分类列表",notes = "购宠->分类->狗狗")
    public ResultVO dogclassselect(){
        return animalDetailService.dogclassselect();
    }
    //分类猫猫列表
    @GetMapping("catclassselect.do")
    @ApiOperation(value = "狗狗分类列表",notes = "购宠->分类->猫猫")
    public ResultVO catclassselect(){
        return animalDetailService.catclassselect();
    }
    //分类不区分猫猫狗狗列表
    @GetMapping("allclassselect.do")
    @ApiOperation(value = "狗狗分类列表",notes = "购宠->分类->不限")
    public ResultVO allclassselect(){
        return animalDetailService.allclassselect();
    }

}
