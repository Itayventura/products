package com.itayventura;

public class Product {

    private String name;

    protected Product(){}

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
