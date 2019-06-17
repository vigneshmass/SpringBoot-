package com.restaturant.api.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String deliveryId;
    private String orderId;
    private Long loginId;
    private  String emplayeeId;
    private String deliveryInfo;

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    public String getEmplayeeId() {
        return emplayeeId;
    }

    public void setEmplayeeId(String emplayeeId) {
        this.emplayeeId = emplayeeId;
    }

    public String getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(String deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }
}
