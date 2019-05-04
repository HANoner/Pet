package com.qf.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
    public List<AnimalDetail> findAllDog() {
        return animalDetailDao.findAllDog();
    }
}
