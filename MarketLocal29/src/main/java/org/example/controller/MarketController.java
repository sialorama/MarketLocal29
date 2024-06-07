package org.example.controller;


import org.example.dao.ClientOrderDao;
import org.example.dao.ProducerDao;
import org.example.dao.ProductDao;
import org.example.model.ClientOrder;
import org.example.model.Market;
import org.example.model.Producer;
import org.example.model.Product;

public class MarketController {
    private Market market;
    private ProducerDao producerDao;
    private ProductDao productDao;
    private ClientOrderDao orderDao;

    public MarketController() {
        market = new Market();
        producerDao = new ProducerDao();
        productDao = new ProductDao();
        orderDao = new ClientOrderDao();
    }

    public void addProducer(Producer producer) {
        producerDao.save(producer);
        market.addProducer(producer);
    }

    public void addProduct(Product product) {
        productDao.save(product);
        market.addProduct(product);
    }

    public void addOrder(ClientOrder order) {
        orderDao.save(order);
        market.addOrder(order);
    }

    public void displayMarket() {
        System.out.println("Producers: " + market.getProducers());
        System.out.println("Products: " + market.getProducts());
        System.out.println("Orders: " + market.getOrders());
    }
}
