package org.example.model;

public class ClientOrder {
    private int id;
    private Product product;
    private int quantity;

    public ClientOrder(int id, Product product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "ClientOrder{id=" + id + ", product=" + product + ", quantity=" + quantity + "}";
    }
}
