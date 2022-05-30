package de.awacademy.shop;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();
    private final Instant createdAt = Instant.now();

    public void add(Product product) {
        this.products.add(product);
    }

    public void remove(Product product) {
        this.products.remove(product);
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public int getProductCount() {
        return this.products.size();
    }

    public int getShippingCost() {
        if (getProductCount() > 5) {
            return 0;
        }
        return 7;
    }
}
