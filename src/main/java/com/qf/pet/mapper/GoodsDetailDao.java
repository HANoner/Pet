package com.qf.pet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.pet.entity.GoodsDetail;
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
public interface GoodsDetailDao extends BaseMapper<GoodsDetail> {
    //特惠专区找10元以下商品
    @Select("select * from goods_detail where goods_price<10 ORDER BY goods_time desc limit 4")
    public List<GoodsDetail> findBenefit();

}