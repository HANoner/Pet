package com.qf.pet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.pet.entity.GoodsDetail;
import com.qf.pet.vo.VGoodsType;
import org.apache.ibatis.annotations.Param;
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

    //新品上市
    @Select("select * from goods_detail where goods_price>0  ORDER BY goods_time  desc LIMIT 4")
    public List<GoodsDetail> findNewGoods();

    //绑定界面信息
    @Select("SELECT c.id cid,c.goods_name cname,c.goods_image imgUrl, p.id pid, p.goods_name pname from goods_detail p \n" +
            "INNER JOIN goods_detail c\n" +
            "on c.goods_parent_code = p.id\n" +
            "where p.goods_type = 1 and c.flag = 2")
    public List<VGoodsType> findType();

    //点击商品类型图片之后跳转到相对应商品
    @Select("SELECT c.* from goods_detail c\n" +
            "INNER JOIN goods_detail p\n" +
            "on c.goods_parent_code = p.id\n" +
            "where c.flag = 3 and p.id = #{tid}")
    public List<GoodsDetail> findByTypeId(@Param("tid") int tid);

}