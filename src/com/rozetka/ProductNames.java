package com.rozetka;

/*
    This class contains enum with product names for search request tests
 */
public enum ProductNames {
    SAMSUNG("Samsung"),
    IPHONE("iPhone");

    private String name;

    ProductNames(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
