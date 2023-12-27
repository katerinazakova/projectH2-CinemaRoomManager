package com.github.katerinazakova;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Cinema {
    private int rows;
    private int seats;
    private char[][] cinemaSeats;

    public Cinema(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
        this.cinemaSeats = new char[rows][seats];
        showEmptySeats(cinemaSeats);
    }

    public void showEmptySeats(char[][] cinemaSeats) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinemaSeats[i][j] = 'S';
            }
        }
    }

    public void showCinemaPlan(char[][] cinemaSeats) {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= cinemaSeats[0].length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 0; i < cinemaSeats.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < cinemaSeats[i].length; j++) {
                System.out.print(" " + cinemaSeats[i][j]);
            }
            System.out.println();
        }
    }

    public void buyTicket(char[][] cinemaSeats) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a row number:");
            int rowNumber = scanner.nextInt();

            System.out.println("Enter a seat number in that row:");
            int seatNumber = scanner.nextInt();

            if (rowNumber < 1 || rowNumber > cinemaSeats.length ||
                    seatNumber < 1 || seatNumber > cinemaSeats[0].length) {
                System.out.println("Wrong input!");
                System.out.println("Enter different seat coordinates.");

            } else if (cinemaSeats[rowNumber - 1][seatNumber - 1] == 'B') {
                System.out.println("That ticket has already been purchased!");
                System.out.println("Enter different seat coordinates.");

            } else {
                int ticketPrice = getTicketPrice(cinemaSeats, rowNumber);
                System.out.println("Ticket price: $" + ticketPrice);
                cinemaSeats[rowNumber - 1][seatNumber - 1] = 'B';
                return;
            }
        }
    }

    public static int getTicketPrice(char[][] cinemaSeats, int rowNumber) {
        int totalSeats = cinemaSeats.length * cinemaSeats[0].length;
        if (totalSeats <= 60 || rowNumber <= cinemaSeats.length / 2) {
            return 10;
        } else {
            return 8;
        }

    }



}
