package com.qf.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.pet.entity.Brand;
import com.qf.pet.mapper.BrandDao;
import com.qf.pet.service.BrandService;
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
public class BrandServiceImpl extends ServiceImpl<BrandDao, Brand> implements BrandService {
    @Autowired
    private BrandDao brandDao;
    @Override
    public List<Brand> searchAllBrand(int limit) {
        return brandDao.findAll(limit);
    }
}
