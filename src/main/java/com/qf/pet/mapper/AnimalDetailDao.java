package com.qf.pet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.pet.entity.AnimalDetail;
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
public interface AnimalDetailDao extends BaseMapper<AnimalDetail> {
    @Select("SELECT ani.* from animal_detail an INNER JOIN animal_detail ani ON an.id = ani.an_parent_id  where an.id = 1 limit 0,5")
    public List<AnimalDetail> findAllDog();

    @Select("SELECT ani.* from animal_detail an INNER JOIN animal_detail ani ON an.id = ani.an_parent_id  where an.id = 2 limit 0,5")
    public List<AnimalDetail> findFiveCat();

    @Select("SELECT ani.* from animal_detail an INNER JOIN animal_detail ani ON an.id = ani.an_parent_id   limit 0,10")
    public List<AnimalDetail> findAll();

    @Select("SELECT ani.* from animal_detail an INNER JOIN animal_detail ani ON an.id = ani.an_parent_id  where an.id = 1")
    public List<AnimalDetail> findclassAllDog();


    @Select("SELECT ani.* from animal_detail an INNER JOIN animal_detail ani ON an.id = ani.an_parent_id  where an.id = 2")
    public List<AnimalDetail> findclassAllCat();


}