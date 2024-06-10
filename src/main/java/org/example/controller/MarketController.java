package org.example.controller;

import org.example.dao.ProductDAO;
import org.example.dao.ProducerDAO;
import org.example.dao.ClientOrderDAO;
import org.example.model.Product;
import org.example.model.Producer;
import org.example.model.ClientOrder;

public class MarketController {
    private ProductDAO productDAO;
    private ProducerDAO producerDAO;
    private ClientOrderDAO clientOrderDAO;

    public MarketController() {
        productDAO = new ProductDAO();
        producerDAO = new ProducerDAO();
        clientOrderDAO = new ClientOrderDAO();
    }

    public void addProduct(Product product) {
        productDAO.save(product);
    }

    public void addProducer(Producer producer) {
        producerDAO.save(producer);
    }

    public void addClientOrder(ClientOrder order) {
        clientOrderDAO.save(order);
    }

/*    // Retrieve a product by its ID
    public Product getProductById(int productId) {
        return productDAO.findById(productId);
    }*/

    // Additional methods to handle market operations can be added here
}
