package com.qf.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.pet.entity.GoodsType;
import com.qf.pet.mapper.GoodsTypeDao;
import com.qf.pet.service.GoodsTypeService;
import com.qf.pet.vo.VGoodsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wsy
 * @since 2019-05-09
 */
@Service
public class GoodsTypeServiceImpl extends ServiceImpl<GoodsTypeDao, GoodsType> implements GoodsTypeService {

    @Autowired
    private GoodsTypeDao goodsTypeDao;
    @Override
    public List<VGoodsType> searchType() {
        return goodsTypeDao.findType1();
    }
}
