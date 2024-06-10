package org.example.model;

import java.util.List;

public class Market {
    private List<Product> products;
    private List<Producer> producers;
    private List<ClientOrder> clientOrders;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducer(Producer producer) {
        producers.add(producer);
    }

    public void addClientOrder(ClientOrder order) {
        clientOrders.add(order);
    }

    // Getters and Setters
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }

    public List<ClientOrder> getClientOrders() {
        return clientOrders;
    }

    public void setClientOrders(List<ClientOrder> clientOrders) {
        this.clientOrders = clientOrders;
    }
}
