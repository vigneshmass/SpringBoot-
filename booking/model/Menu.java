package com.restaturant.api.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String menuId;

    private String brackFast;
    private String lunch;
    private String dinner;

   /* @OneToMany
    @JoinColumn(name = "menu_item_id")
    private List<MenuItem> menuItem = new ArrayList<MenuItem>();
    @ManyToOne
    private Rest rest;*/

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getBrackFast() {
        return brackFast;
    }

    public void setBrackFast(String brackFast) {
        this.brackFast = brackFast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

   /* public List<MenuItem> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(List<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }

    public Rest getRest() {
        return rest;
    }

    public void setRest(Rest rest) {
        this.rest = rest;
    }*/
}