package com.restaturant.api.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String manuItemId;
    private String foodName;
    /*@ManyToOne
    private Menu menu;
    @OneToMany
    private List<MenuItemPrice> menuItemPrices=new ArrayList<MenuItemPrice>();    */

    public String getManuItemId() {
        return manuItemId;
    }

    public void setManuItemId(String manuItemId) {
        this.manuItemId = manuItemId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

  /*  public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<MenuItemPrice> getMenuItemPrices() {
        return menuItemPrices;
    }

    public void setMenuItemPrices(List<MenuItemPrice> menuItemPrices) {
        this.menuItemPrices = menuItemPrices;
    }*/
}



