package com.example.busbooking.service;

import com.example.busbooking.model.*;
import java.time.LocalDateTime;
import java.util.*;

public class SchedulerService {
    private final List<Schedule> schedules = new ArrayList<>();
    private int nextId = 1;

    private final BusService busService;
    private final RouteService routeService;

    public SchedulerService(BusService b, RouteService r) {
        this.busService = b;
        this.routeService = r;
    }

    public void addSchedule(int busId, int routeId, LocalDateTime dep, LocalDateTime arr) {
        Bus bus = busService.getById(busId);
        Route route = routeService.getById(routeId);

        if (bus == null || route == null) {
            System.out.println("Bus or Route not found.");
            return;
        }

        Schedule s = new Schedule();
        s.setId(nextId++);
        s.setBus(bus);
        s.setRoute(route);
        s.setDeparture(dep);
        s.setArrival(arr);
        schedules.add(s);
        System.out.println("Schedule added: " + s);
    }

    public Schedule getById(int id) {
        return schedules.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public void listSchedules() {
        schedules.forEach(System.out::println);
    }
}
