package com.github.katerinazakova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        CinemaSeatPlan cinema = new CinemaSeatPlan(rows, seats);

        while (true) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cinema.showCinemaPlan(cinema.getCinemaSeats());
                    break;
                case 2:
                    CinemaTickets cinematickets = new CinemaTickets();
                    cinematickets.buyTicket(cinema.getCinemaSeats());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

}