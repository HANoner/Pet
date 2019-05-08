package com.qf.pet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.pet.entity.Brand;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
public interface BrandService extends IService<Brand> {
    //展示所有品牌信息
    public List<Brand> searchAllBrand(int limit);
    //主粮品牌展示
    public List<Brand> searchStaple(int fromIndex,int toIndex);

}
