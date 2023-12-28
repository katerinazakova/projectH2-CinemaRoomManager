package com.github.katerinazakova;

import java.util.Scanner;

public class CinemaTickets {

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

    private int getTicketPrice(char[][] cinemaSeats, int rowNumber) {
        int totalSeats = cinemaSeats.length * cinemaSeats[0].length;
        if (totalSeats <= 60 || rowNumber <= cinemaSeats.length / 2) {
            return 10;
        } else {
            return 8;
        }
    }

}
