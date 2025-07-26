package com.example.busbooking.model;

import lombok.Data;

@Data
public class Booking {
    private int id;
    private Schedule schedule;
    private String seatNumber;
    private String passengerName;
}