package org.example.dao;

import org.example.model.ClientOrder;

import java.util.ArrayList;
import java.util.List;

public class ClientOrderDao {
    private List<ClientOrder> orders = new ArrayList<>();

    public void save(ClientOrder order) {
        orders.add(order);
    }

    public List<ClientOrder> getAll() {
        return new ArrayList<>(orders);
    }

    public ClientOrder getById(int id) {
        return orders.stream().filter(o -> o.getId() == id).findFirst().orElse(null);
    }
}
