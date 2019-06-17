package com.restaturant.api.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emplayee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String emplayeeId;
    private String emplayeeName;
    private  String emplayeeEmail;
    private String emplayeeContact;
    private String orderId;

    public String getEmplayeeId() {
        return emplayeeId;
    }

    public void setEmplayeeId(String emplayeeId) {
        this.emplayeeId = emplayeeId;
    }

    public String getEmplayeeName() {
        return emplayeeName;
    }

    public void setEmplayeeName(String emplayeeName) {
        this.emplayeeName = emplayeeName;
    }

    public String getEmplayeeEmail() {
        return emplayeeEmail;
    }

    public void setEmplayeeEmail(String emplayeeEmail) {
        this.emplayeeEmail = emplayeeEmail;
    }

    public String getEmplayeeContact() {
        return emplayeeContact;
    }

    public void setEmplayeeContact(String emplayeeContact) {
        this.emplayeeContact = emplayeeContact;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
