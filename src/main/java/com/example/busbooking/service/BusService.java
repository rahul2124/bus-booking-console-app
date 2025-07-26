package com.example.busbooking.service;

import com.example.busbooking.model.Bus;
import java.util.*;

public class BusService {
    private final List<Bus> buses = new ArrayList<>();
    private int nextId = 1;

    public void addBus(String name, int capacity) {
        Bus b = new Bus();
        b.setId(nextId++);
        b.setName(name);
        b.setCapacity(capacity);
        buses.add(b);
        System.out.println("Bus added: " + b);
    }

    public Bus getById(int id) {
        return buses.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    public List<Bus> getAll() {
        return buses;
    }
}