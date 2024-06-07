package org.example.dao;

import org.example.model.Producer;

import java.util.ArrayList;
import java.util.List;

public class ProducerDao {
    private List<Producer> producers = new ArrayList<>();

    public void save(Producer producer) {
        producers.add(producer);
    }

    public List<Producer> getAll() {
        return new ArrayList<>(producers);
    }

    public Producer getById(int id) {
        return producers.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}
