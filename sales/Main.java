package com.sales;

import com.sales.goods.electronic.Laptop;
import com.sales.goods.electronic.Smartphone;
import com.sales.shop.online.EShop;
import com.sales.tax.Tax;

public class Main {

    public static void main(String[] args) {
        EShop eShop = new EShop();
        eShop.addNewGoods(new Laptop(600, "Game pc ", "Lenovo"));
        eShop.addNewGoods(new Laptop(100, "Home pc ", "Gigabyte"));
        eShop.addNewGoods(new Smartphone(300, "For photo ", "iPhone"));
        eShop.addNewGoods(new Smartphone(200, "For serf internet ", "Samsung"));
        Tax tax = new Tax();
        System.out.println(tax.calcDamagesDuringDestroy(eShop));
    }
}
