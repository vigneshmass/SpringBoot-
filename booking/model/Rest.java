package com.restaturant.api.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String resttId;
    private String restName;
    private  String restAddress;
    private String restPin;
    private String resttype;
    private String restRegion;

    public String getResttId() {
        return resttId;
    }

    public void setResttId(String resttId) {
        this.resttId = resttId;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestAddress() {
        return restAddress;
    }

    public void setRestAddress(String restAddress) {
        this.restAddress = restAddress;
    }

    public String getRestPin() {
        return restPin;
    }

    public void setRestPin(String restPin) {
        this.restPin = restPin;
    }

    public String getResttype() {
        return resttype;
    }

    public void setResttype(String resttype) {
        this.resttype = resttype;
    }

    public String getRestRegion() {
        return restRegion;
    }

    public void setRestRegion(String restRegion) {
        this.restRegion = restRegion;
    }
}
