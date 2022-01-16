package com.sales.goods.electronic;

import com.sales.goods.Goods;

//TODO: finish
public class Smartphone extends Goods {
    private String brand;

    public Smartphone (long price, String description, String brand) {
        super(price, description);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "brand = " + brand;
    }
}
