package com.example.busbooking;

import com.example.busbooking.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Scanner;

@Component
public class ConsoleApp implements CommandLineRunner {

    private final BusService busService = new BusService();
    private final RouteService routeService = new RouteService();
    private final SchedulerService scheduleService = new SchedulerService(busService, routeService);
    private final BookingService bookingService = new BookingService(scheduleService);

    @Override
    public void run(String... args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Bus Booking System ===");
            System.out.println("1. Add Bus");
            System.out.println("2. Add Route");
            System.out.println("3. Add Schedule");
            System.out.println("4. Book Seat");
            System.out.println("5. View Schedules");
            System.out.println("6. View Bookings");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt(); sc.nextLine();

            switch (ch) {
                case 1 -> {
                    System.out.print("Bus Name: ");
                    String busName = sc.nextLine();
                    System.out.print("Capacity: ");
                    int cap = sc.nextInt(); sc.nextLine();
                    busService.addBus(busName, cap);
                }
                case 2 -> {
                    System.out.print("Source: ");
                    String src = sc.nextLine();
                    System.out.print("Destination: ");
                    String dst = sc.nextLine();
                    routeService.addRoute(src, dst);
                }
                case 3 -> {
                    System.out.print("Bus ID: ");
                    int busId = sc.nextInt();
                    System.out.print("Route ID: ");
                    int routeId = sc.nextInt(); sc.nextLine();
                    System.out.print("Departure (yyyy-MM-ddTHH:mm): ");
                    LocalDateTime dep = LocalDateTime.parse(sc.nextLine());
                    System.out.print("Arrival (yyyy-MM-ddTHH:mm): ");
                    LocalDateTime arr = LocalDateTime.parse(sc.nextLine());
                    scheduleService.addSchedule(busId, routeId, dep, arr);
                }
                case 4 -> {
                    System.out.print("Schedule ID: ");
                    int schId = sc.nextInt(); sc.nextLine();
                    System.out.print("Seat No: ");
                    String seat = sc.nextLine();
                    System.out.print("Passenger Name: ");
                    String pname = sc.nextLine();
                    bookingService.bookSeat(schId, seat, pname);
                }
                case 5 -> scheduleService.listSchedules();
                case 6 -> {
                    System.out.print("Schedule ID: ");
                    int sId = sc.nextInt();
                    bookingService.listBookings(sId);
                }
                case 7 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            }
        }
    }
}
