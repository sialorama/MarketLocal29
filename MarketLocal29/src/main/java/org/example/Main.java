package org.example;

import org.example.controller.MarketController;
import org.example.model.ClientOrder;
import org.example.model.Producer;
import org.example.model.Product;

public class Main {
    public static void main(String[] args) {
        MarketController controller = new MarketController();

        // Create and add producers
        Producer producer1 = new Producer(1, "Franc Halliday");
        Producer producer2 = new Producer(2, "Marc Belleville");

        controller.addProducer(producer1);
        controller.addProducer(producer2);

        // Create and add products
        Product product1 = new Product(1, "Fraise de plougastel", 0.5);
        Product product2 = new Product(2, "Pommes", 0.7);

        controller.addProduct(product1);
        controller.addProduct(product2);

        // Create and add orders
        ClientOrder order1 = new ClientOrder(1, product1, 15);
        ClientOrder order2 = new ClientOrder(2, product2, 8);

        controller.addOrder(order1);
        controller.addOrder(order2);

        // Display the market state
        controller.displayMarket();
    }
}