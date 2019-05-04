package com.qf.pet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.entity.AnimalDetail;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
public interface AnimalDetailService extends IService<AnimalDetail> {
    public ResultVO findAllDog();
}
