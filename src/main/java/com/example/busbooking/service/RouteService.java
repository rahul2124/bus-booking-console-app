package com.example.busbooking.service;

import com.example.busbooking.model.Route;
import java.util.*;

public class RouteService {
    private final List<Route> routes = new ArrayList<>();
    private int nextId = 1;

    public void addRoute(String src, String dst) {
        Route r = new Route();
        r.setId(nextId++);
        r.setSource(src);
        r.setDestination(dst);
        routes.add(r);
        System.out.println("Route added: " + r);
    }

    public Route getById(int id) {
        return routes.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
    }

    public List<Route> getAll() {
        return routes;
    }
}
