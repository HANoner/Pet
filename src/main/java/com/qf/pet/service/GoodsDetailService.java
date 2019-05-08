package com.qf.pet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.pet.entity.GoodsDetail;
import com.qf.pet.vo.VGoodsType;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
public interface GoodsDetailService extends IService<GoodsDetail> {
    //优惠商品
    public List<GoodsDetail> searchBenefit();

    //查找新品上市商品
    public List<GoodsDetail> searchNewGoods();

    //猫猫商品类型展示
    public List<VGoodsType> searchType();
}
