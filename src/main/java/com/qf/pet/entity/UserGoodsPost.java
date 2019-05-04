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
@TableName("user_goods_post")
public class UserGoodsPost extends Model<UserGoodsPost> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("user_id")
	private Integer userId;
	@TableField("like_goods_id")
	private Integer likeGoodsId;
	@TableField("like_post_id")
	private Integer likePostId;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getLikeGoodsId() {
		return likeGoodsId;
	}

	public void setLikeGoodsId(Integer likeGoodsId) {
		this.likeGoodsId = likeGoodsId;
	}

	public Integer getLikePostId() {
		return likePostId;
	}

	public void setLikePostId(Integer likePostId) {
		this.likePostId = likePostId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
