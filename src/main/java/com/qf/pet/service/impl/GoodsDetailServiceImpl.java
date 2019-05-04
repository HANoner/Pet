package com.qf.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.pet.entity.GoodsDetail;
import com.qf.pet.mapper.GoodsDetailDao;
import com.qf.pet.service.GoodsDetailService;
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
public class GoodsDetailServiceImpl extends ServiceImpl<GoodsDetailDao, GoodsDetail> implements GoodsDetailService {
    @Autowired
    private GoodsDetailDao goodsDetailDao;
    @Override
    public List<GoodsDetail> searchBenefit() {
        return goodsDetailDao.findBenefit();
    }
}
