package org.example.model;

public class Producer {
    private int id;
    private String name;

    public Producer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Producer{id=" + id + ", name='" + name + "'}";
    }
}
