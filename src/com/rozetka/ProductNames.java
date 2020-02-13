package com.rozetka;

import lombok.Data;
import lombok.Getter;

/*
    This class contains enum with product names for search request tests
 */
@Getter
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
