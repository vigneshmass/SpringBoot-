package com.restaturant.api.booking.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orderdetails {

    @Id
    private String orderId;
    private String foodId;
    private String deliveryId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String oredrId) {
        this.orderId = oredrId;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }
}
