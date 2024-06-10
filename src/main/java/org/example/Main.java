package org.example;

import org.example.controller.MarketController;
import org.example.model.Product;
import org.example.model.Producer;
import org.example.model.ClientOrder;
import org.example.utils.HibernateUtil;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MarketController controller = new MarketController();

        // Ajouter un producteur
        Producer producer = new Producer("Marie LAWSON", "marie@example.com");
        controller.addProducer(producer);

        // Ajouter un produit
        Product product = new Product("Ananas", 2.50);
        controller.addProduct(product);

        // Créer une commande client
        ClientOrder order = new ClientOrder(product, 2, new Date());
        controller.addClientOrder(order);

        System.out.println("Données ajoutées avec succès!");

        // Fermer la factory Hibernate
        HibernateUtil.shutdown();
    }
}
