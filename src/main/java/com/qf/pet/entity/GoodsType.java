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
 * @since 2019-05-09
 */
@TableName("goods_type")
public class GoodsType extends Model<GoodsType> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("type_name")
	private String typeName;
    /**
     * 1猫 2狗 所属那个动物的商品
     */
	private Integer type;
	@TableField("type_image")
	private String typeImage;
	@TableField("type_parent_code")
	private Integer typeParentCode;
    /**
     * 1是父，2是子
     */
	private Integer flag;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTypeImage() {
		return typeImage;
	}

	public void setTypeImage(String typeImage) {
		this.typeImage = typeImage;
	}

	public Integer getTypeParentCode() {
		return typeParentCode;
	}

	public void setTypeParentCode(Integer typeParentCode) {
		this.typeParentCode = typeParentCode;
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
