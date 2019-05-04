package com.qf.pet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.pet.entity.GoodsDetail;

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
}
