package com.example.busbooking.service;

import com.example.busbooking.model.*;
import java.util.*;

public class BookingService {
    private final List<Booking> bookings = new ArrayList<>();
    private int nextId = 1;

    private final SchedulerService scheduleService;

    public BookingService(SchedulerService ss) {
        this.scheduleService = ss;
    }

    public void bookSeat(int scheduleId, String seatNo, String passenger) {
        Schedule s = scheduleService.getById(scheduleId);
        if (s == null) {
            System.out.println("Schedule not found.");
            return;
        }

        boolean alreadyBooked = bookings.stream()
                .anyMatch(b -> b.getSchedule().getId() == scheduleId && b.getSeatNumber().equalsIgnoreCase(seatNo));
        if (alreadyBooked) {
            System.out.println("Seat already booked.");
            return;
        }

        Booking b = new Booking();
        b.setId(nextId++);
        b.setSchedule(s);
        b.setSeatNumber(seatNo);
        b.setPassengerName(passenger);
        bookings.add(b);
        System.out.println("Booking successful: " + b);
    }

    public void listBookings(int scheduleId) {
        bookings.stream()
                .filter(b -> b.getSchedule().getId() == scheduleId)
                .forEach(System.out::println);
    }
}
