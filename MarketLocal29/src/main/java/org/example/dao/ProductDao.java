package org.example.dao;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private List<Product> products = new ArrayList<>();

    public void save(Product product) {
        products.add(product);
    }

    public List<Product> getAll() {
        return new ArrayList<>(products);
    }

    public Product getById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}
