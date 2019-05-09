package com.qf.pet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.pet.entity.GoodsType;
import com.qf.pet.vo.VGoodsType;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author wsy
 * @since 2019-05-09
 */
public interface GoodsTypeDao extends BaseMapper<GoodsType> {
    //绑定界面信息
    public List<VGoodsType> findType();

}