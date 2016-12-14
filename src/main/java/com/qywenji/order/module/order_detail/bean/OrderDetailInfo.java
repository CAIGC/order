package com.qywenji.order.module.order_detail.bean;

import javax.persistence.*;

/**
 * Created by CAI_GC on 2016/12/14.
 */
@Entity
@Table
public class OrderDetailInfo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /*订单编号*/
    private String orderCode;
    /*订单id*/
    private Integer orderId;
    /*商品单价*/
    private Float price;
    /*商品数量*/
    private Integer amount;
    /*商品编码*/
    private String itemCode;
    /*商品规格*/
    private String productSize;
    /*状态：0：未支付，1已支付*/
    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
