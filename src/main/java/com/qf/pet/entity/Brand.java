package com.qf.pet.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
@TableName("brand")
public class Brand extends Model<Brand> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("brand_name")
	private String brandName;
	@TableField("brand_img")
	private String brandImg;
	@TableField("brand_area")
	private String brandArea;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandImg() {
		return brandImg;
	}

	public void setBrandImg(String brandImg) {
		this.brandImg = brandImg;
	}

	public String getBrandArea() {
		return brandArea;
	}

	public void setBrandArea(String brandArea) {
		this.brandArea = brandArea;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
