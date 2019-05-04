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
@TableName("animal_detail")
public class AnimalDetail extends Model<AnimalDetail> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 1猫 2 狗
     */
	@TableField("an_name")
	private String anName;
    /**
     * 1猫 2狗
     */
	@TableField("an_type")
	private Integer anType;
	@TableField("an_price")
	private Integer anPrice;
	@TableField("an_area")
	private String anArea;
	@TableField("an_img")
	private String anImg;
	@TableField("an_color")
	private String anColor;
	@TableField("an_age")
	private Integer anAge;
	@TableField("an_text")
	private String anText;
    /**
     * 1 雄 2 雌
     */
	@TableField("an_sex")
	private Integer anSex;
    /**
     * 库存
     */
	@TableField("an_count")
	private Integer anCount;
	@TableField("an_parent_id")
	private Integer anParentId;
	@TableField("an_url")
	private String anUrl;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnName() {
		return anName;
	}

	public void setAnName(String anName) {
		this.anName = anName;
	}

	public Integer getAnType() {
		return anType;
	}

	public void setAnType(Integer anType) {
		this.anType = anType;
	}

	public Integer getAnPrice() {
		return anPrice;
	}

	public void setAnPrice(Integer anPrice) {
		this.anPrice = anPrice;
	}

	public String getAnArea() {
		return anArea;
	}

	public void setAnArea(String anArea) {
		this.anArea = anArea;
	}

	public String getAnImg() {
		return anImg;
	}

	public void setAnImg(String anImg) {
		this.anImg = anImg;
	}

	public String getAnColor() {
		return anColor;
	}

	public void setAnColor(String anColor) {
		this.anColor = anColor;
	}

	public Integer getAnAge() {
		return anAge;
	}

	public void setAnAge(Integer anAge) {
		this.anAge = anAge;
	}

	public String getAnText() {
		return anText;
	}

	public void setAnText(String anText) {
		this.anText = anText;
	}

	public Integer getAnSex() {
		return anSex;
	}

	public void setAnSex(Integer anSex) {
		this.anSex = anSex;
	}

	public Integer getAnCount() {
		return anCount;
	}

	public void setAnCount(Integer anCount) {
		this.anCount = anCount;
	}

	public Integer getAnParentId() {
		return anParentId;
	}

	public void setAnParentId(Integer anParentId) {
		this.anParentId = anParentId;
	}

	public String getAnUrl() {
		return anUrl;
	}

	public void setAnUrl(String anUrl) {
		this.anUrl = anUrl;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
