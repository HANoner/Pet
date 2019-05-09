package com.qf.pet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wsy
 * @since 2019-05-09
 */
@TableName("goods_detail")
public class GoodsDetail extends Model<GoodsDetail> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("goods_name")
	private String goodsName;
	@TableField("goods_price")
	private Integer goodsPrice;
	@TableField("goods_time")
	private Date goodsTime;
	@TableField("goods_image")
	private String goodsImage;
	@TableField("goods_count")
	private Integer goodsCount;
	@TableField("goods_detail")
	private String goodsDetail;
	@TableField("goods_brand")
	private Integer goodsBrand;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Integer goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Date getGoodsTime() {
		return goodsTime;
	}

	public void setGoodsTime(Date goodsTime) {
		this.goodsTime = goodsTime;
	}

	public String getGoodsImage() {
		return goodsImage;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	public Integer getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public String getGoodsDetail() {
		return goodsDetail;
	}

	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public Integer getGoodsBrand() {
		return goodsBrand;
	}

	public void setGoodsBrand(Integer goodsBrand) {
		this.goodsBrand = goodsBrand;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
