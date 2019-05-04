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
@TableName("post_bar")
public class PostBar extends Model<PostBar> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("post_name")
	private String postName;
    /**
     * 用户的id  作者
     */
	@TableField("post_wirter_id")
	private Integer postWirterId;
	@TableField("post_text")
	private String postText;
    /**
     * 地址外键
     */
	@TableField("post_addr")
	private String postAddr;
	@TableField("post_likes")
	private Integer postLikes;
    /**
     * 1猫圈 2狗圈 3爪友生活 4其他
     */
	@TableField("post_type")
	private Integer postType;
	private Integer flag;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public Integer getPostWirterId() {
		return postWirterId;
	}

	public void setPostWirterId(Integer postWirterId) {
		this.postWirterId = postWirterId;
	}

	public String getPostText() {
		return postText;
	}

	public void setPostText(String postText) {
		this.postText = postText;
	}

	public String getPostAddr() {
		return postAddr;
	}

	public void setPostAddr(String postAddr) {
		this.postAddr = postAddr;
	}

	public Integer getPostLikes() {
		return postLikes;
	}

	public void setPostLikes(Integer postLikes) {
		this.postLikes = postLikes;
	}

	public Integer getPostType() {
		return postType;
	}

	public void setPostType(Integer postType) {
		this.postType = postType;
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
