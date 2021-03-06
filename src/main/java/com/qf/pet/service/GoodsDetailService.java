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

    //查找新品上市商品
    public List<GoodsDetail> searchNewGoods();


    //点击商品类型图片之后跳转到相对应商品
    public List<GoodsDetail> searchByTypeId(int tid);

    //    //商城商品搜索
    public List<GoodsDetail> searchByName(String goodsName);

    //在页面点击图片根据id进行商品查找进入商品详情页面
    public GoodsDetail searchByGoodsId(int id);
}
