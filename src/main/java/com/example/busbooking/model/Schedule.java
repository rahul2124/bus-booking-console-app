package com.example.busbooking.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Schedule {
    private int id;
    private Bus bus;
    private Route route;
    private LocalDateTime departure;
    private LocalDateTime arrival;
}