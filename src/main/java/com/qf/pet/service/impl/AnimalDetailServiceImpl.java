package com.qf.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.pet.common.util.ResultUtil;
import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.entity.AnimalDetail;
import com.qf.pet.mapper.AnimalDetailDao;
import com.qf.pet.service.AnimalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
@Service
public class AnimalDetailServiceImpl extends ServiceImpl<AnimalDetailDao, AnimalDetail> implements AnimalDetailService {

    @Autowired
    private AnimalDetailDao animalDetailDao;
    @Override
    public ResultVO findAllDog() {

        List<AnimalDetail> allDog = animalDetailDao.findAllDog();

        //long count = ((Page)allDog).getTotal();
        //long count = ((Page)allDog).getTotal();

     //   System.out.println(count +" ++++++++++++++++++++++++++++++++++++++");
        return ResultUtil.exec(allDog != null,"查找首页的五条狗狗信息",allDog);
    }

    @Override
    public ResultVO findFiveCat() {
        List<AnimalDetail> fiveCat = animalDetailDao.findFiveCat();
        return ResultUtil.exec(fiveCat != null,"查找首页的五条猫猫信息",fiveCat);
    }

    @Override
    public ResultVO findAll() {
        List<AnimalDetail> all = animalDetailDao.findAll();
        return ResultUtil.exec(all != null,"更多萌宠",all);
    }

    @Override
    public ResultVO dogclassselect() {
        List<AnimalDetail> all = animalDetailDao.findclassAllDog();
        return ResultUtil.exec(all !=null,"查看狗狗分类",all);
    }

    @Override
    public ResultVO catclassselect() {
        List<AnimalDetail> all = animalDetailDao.findclassAllCat();
        return ResultUtil.exec(all !=null,"查看猫猫分类",all);
    }

    @Override
    public ResultVO allclassselect() {
        List<AnimalDetail> all = animalDetailDao.findAll();
        return ResultUtil.exec(all !=null,"查看所有宠物分类",all);
    }


}
