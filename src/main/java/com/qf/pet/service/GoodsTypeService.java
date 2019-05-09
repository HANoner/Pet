package com.qf.pet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.pet.entity.GoodsType;
import com.qf.pet.vo.VGoodsType;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wsy
 * @since 2019-05-09
 */
public interface GoodsTypeService extends IService<GoodsType> {
    //猫猫商品类型展示
    public List<VGoodsType> searchType();
	
}
