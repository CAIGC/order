package com.qywenji.order.module.order.bean;

import javax.persistence.*;

/**
 * Created by CAI_GC on 2016/12/14.
 */
@Entity
@Table
public class OrderInfo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /*订单编号*/
    private String orderCode;
    /*订单状态：0未支付，1：已支付，2：配送中，3：已完成*/
    private Byte status;
    /*订单总额*/
    private Float totalMoney;
    /*下单人openId*/
    private String openId;
    /*下单人昵称*/
    private String nickname;
    /*下单人电话*/
    private String phone;
    /*支付时间*/
    private String payTime;
    /*订单创建时间*/
    private String ctime;
    /*订单完成时间*/
    private String finishTime;
    /*微信支付回调id*/
    private String transactionId;
    /*支付方式，暂时只有微信支付*/
    private Byte payType;


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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Float totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }
}
