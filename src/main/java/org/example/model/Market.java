package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private List<Producer> producers = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private List<ClientOrder> orders = new ArrayList<>();

    // Methods to add producers, products, and orders
    public void addProducer(Producer producer) {
        producers.add(producer);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addOrder(ClientOrder order) {
        orders.add(order);
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<ClientOrder> getOrders() {
        return orders;
    }
}
