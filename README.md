# 🚌 Bus Booking System (Console App using Java & Spring Boot)

This is a **console-based Java application** built using **Spring Boot**. It simulates a bus booking system where users can add buses, routes, and schedules, and book seats through a command-line interface. All data is stored in-memory using Java Lists — no database is used.

---

## ✅ Features

- Add new Buses with capacity
- Add Routes (source and destination)
- Add Schedules for a bus on a route with departure and arrival time
- Book Seats by entering schedule ID, seat number, and passenger name
- View all Schedules
- View Bookings for a specific schedule
- Exit the application

---

## 🛠️ Tech Stack

| Technology     | Description                  |
|----------------|------------------------------|
| Java           | Programming Language         |
| Spring Boot    | Backend Framework            |
| Lombok         | For reducing boilerplate code|
| Scanner Class  | For user input via console   |
| Maven          | Build and dependency manager |

---

## 🗂️ Project Structure

```
busbooking/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/busbooking/
│   │   │       ├── model/                      # 📦 Data Models
│   │   │       │   ├── Bus.java
│   │   │       │   ├── Route.java
│   │   │       │   ├── Schedule.java
│   │   │       │   └── Booking.java
│   │   │       │
│   │   │       ├── service/                    # 🔧 Business Logic
│   │   │       │   ├── BusService.java
│   │   │       │   ├── RouteService.java
│   │   │       │   ├── SchedulerService.java
│   │   │       │   └── BookingService.java
│   │   │       │
│   │   │       ├── ConsoleApp.java             # 🖥️ Handles CLI using Scanner
│   │   │       └── BusbookingApplication.java  # 🚀 Main class with @SpringBootApplication
│   │   │
│   │   └── resources/
│   │       └── application.properties          # ⚙️ Minimal config
│
├── .gitignore                                  # 🧼 Ignore build/IDE files
├── pom.xml                                     # 📦 Maven config (Spring Boot, Lombok)
├── README.md                                   # 📘 Project info & usage
```


## ⚙️ Dependencies in `pom.xml`

- `spring-boot-starter`
- `lombok`
- ❌ Excluded: database, web, or security dependencies (since it's a pure console app)

---

## 🚫 What This Project Does Not Include

- ❌ No web UI
- ❌ No REST APIs
- ❌ No database (data stored only in memory)
- ❌ No Spring Security (can be added later)

---

## 🚀 Future Enhancements

- REST API endpoints (Spring Web)
- Database support (MySQL or H2)
- File storage (CSV/JSON persistence)
- Web UI with Angular/React
- JWT authentication

---

## 🖥️ Sample Console Demo

=== Bus Booking System ===

1. Add Bus
   Choice: 1
   Enter Bus Name: KSRTC Express
   Enter Total Seats: 40
   Bus added successfully!

2. Add Route
   Choice: 2
   Enter Source: Bangalore
   Enter Destination: Chennai
   Route added successfully!

3. Add Schedule
   Choice: 3
   Enter Bus ID: 1
   Enter Route ID: 1
   Enter Departure Time (yyyy-MM-dd HH:mm): 2023-08-01 10:00
   Enter Arrival Time (yyyy-MM-dd HH:mm): 2023-08-01 12:00
   Schedule added successfully!

4. Book Seats
   Choice: 4
   Enter Schedule ID: 1
   Enter Seat Number: 1
   Enter Passenger Name: John Doe
   Seat booked successfully!

5. View All Schedules
   Choice: 5
   Schedule ID: 1
   Bus: KSRTC Express
   Source: Bangalore
   Destination: Chennai
   Departure Time: 2023-08-01 10:00
   Arrival Time: 2023-08-01 12:00
   Seats Available: 39
   Seats Booked: 1

6. View Bookings
   Choice: 6
   Enter Schedule ID: 1
   Booking ID: 1
   Seat Number: 1
   Passenger Name: John Doe

7. Exit

---

## 🧑‍💻 Author

**Rahul V**  
Java | Spring Boot Developer

---
