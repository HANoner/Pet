package com.qf.pet.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
@TableName("goods_detail")
public class GoodsDetail extends Model<GoodsDetail> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("goods_name")
	private String goodsName;
	@TableField("goods_type")
	private String goodsType;
	@TableField("goods_price")
	private Integer goodsPrice;
	@TableField("goods_image")
	private String goodsImage;
	@TableField("goods_count")
	private Integer goodsCount;
	@TableField("goods_detail")
	private String goodsDetail;
	@TableField("goods_brands")
	private String goodsBrands;
	@TableField("goods_parent_code")
	private Integer goodsParentCode;
	@TableField("goods_url")
	private String goodsUrl;
	private Integer flag;


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

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public Integer getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Integer goodsPrice) {
		this.goodsPrice = goodsPrice;
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

	public String getGoodsBrands() {
		return goodsBrands;
	}

	public void setGoodsBrands(String goodsBrands) {
		this.goodsBrands = goodsBrands;
	}

	public Integer getGoodsParentCode() {
		return goodsParentCode;
	}

	public void setGoodsParentCode(Integer goodsParentCode) {
		this.goodsParentCode = goodsParentCode;
	}

	public String getGoodsUrl() {
		return goodsUrl;
	}

	public void setGoodsUrl(String goodsUrl) {
		this.goodsUrl = goodsUrl;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
