package com.github.katerinazakova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        Cinema cinema = new Cinema(rows, seats);

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
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Enter a row number:");
                    int rowNumber = scanner2.nextInt();

                    System.out.println("Enter a seat number in that row:");
                    int seatNumber = scanner2.nextInt();
                    cinema.buyTicket(cinema.getCinemaSeats(), rowNumber, seatNumber);
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