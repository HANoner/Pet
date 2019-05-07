package com.qf.pet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.pet.entity.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
public interface BrandDao extends BaseMapper<Brand> {
    //展示品牌信息
    @Select("SELECT * from brand ")
    public List<Brand> findAll();

}