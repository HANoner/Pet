package com.qf.pet.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
@TableName("orders")
public class Orders extends Model<Orders> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	@TableField("order_time")
	private Date orderTime;
	@TableField("order_bidprice")
	private Integer orderBidprice;
	@TableField("order_transactionprice")
	private Integer orderTransactionprice;
	@TableField("order_uid")
	private Integer orderUid;
	@TableField("order_address")
	private String orderAddress;
	@TableField("order_animal_id")
	private Integer orderAnimalId;
	@TableField("order_goods_id")
	private Integer orderGoodsId;
	@TableField("order_type")
	private String orderType;
    /**
     * 1.自提0元 2.同城0元 3.外地150元
     */
	@TableField("order_expressage_flag")
	private Integer orderExpressageFlag;
    /**
     * 订单状态1.待支付2.已支付3.已完成4.已取消
     */
	@TableField("order_status")
	private Integer orderStatus;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getOrderBidprice() {
		return orderBidprice;
	}

	public void setOrderBidprice(Integer orderBidprice) {
		this.orderBidprice = orderBidprice;
	}

	public Integer getOrderTransactionprice() {
		return orderTransactionprice;
	}

	public void setOrderTransactionprice(Integer orderTransactionprice) {
		this.orderTransactionprice = orderTransactionprice;
	}

	public Integer getOrderUid() {
		return orderUid;
	}

	public void setOrderUid(Integer orderUid) {
		this.orderUid = orderUid;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public Integer getOrderAnimalId() {
		return orderAnimalId;
	}

	public void setOrderAnimalId(Integer orderAnimalId) {
		this.orderAnimalId = orderAnimalId;
	}

	public Integer getOrderGoodsId() {
		return orderGoodsId;
	}

	public void setOrderGoodsId(Integer orderGoodsId) {
		this.orderGoodsId = orderGoodsId;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Integer getOrderExpressageFlag() {
		return orderExpressageFlag;
	}

	public void setOrderExpressageFlag(Integer orderExpressageFlag) {
		this.orderExpressageFlag = orderExpressageFlag;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
