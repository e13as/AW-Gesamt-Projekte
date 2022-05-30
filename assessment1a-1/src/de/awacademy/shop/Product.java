package de.awacademy.shop;

import java.util.Random;

public class Product {

    private final String id;
    private final String name;
    private final Category category;

    public Product(String name, Category category) {
        this.id = "D" + (new Random().nextInt(500) * 3);
        this.name = name;
        this.category = category;
    }

    public Product(String id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}
