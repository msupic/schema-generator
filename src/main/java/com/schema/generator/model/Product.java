package com.schema.generator.model;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import javax.validation.constraints.Size;

@MappedEntity("PRODUCTS")
public class Product {

    @Id
    @Size(max = 20)
    private final String sku;

    @Size(max = 30)
    private final String brand;

    public Product(String sku, String brand) {
        this.sku = sku;
        this.brand = brand;
    }

    public String getSku() {
        return sku;
    }

    public String getBrand() {
        return brand;
    }
}
