package com.qf.pet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.pet.entity.GoodsType;
import com.qf.pet.vo.VGoodsType;
import org.apache.ibatis.annotations.Param;

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
    //绑定界面信息type为猫猫还是狗狗还是等等
    public List<VGoodsType> findType1(@Param("type") int type);

}