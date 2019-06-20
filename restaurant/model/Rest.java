package com.restaturant.api.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String restId;
    private String restName;
    private String restAddress;

    private String restType;
   /* @ManyToOne
    //@JoinColumn(name = "locationId", referencedColumnName = "locationId")
    private Location location;
    @OneToMany
    private List<Menu> menu= new ArrayList<Menu>();

    */


    public String getRestType() {
        return restType;
    }

    public void setRestType(String restType) {
        this.restType = restType;
    }

   /* public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    */


    public String getRestId() {
        return restId;
    }

    public void setRestId(String restId) {
        this.restId = restId;
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



  /*  public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

   */
}