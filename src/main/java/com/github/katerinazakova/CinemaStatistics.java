package com.github.katerinazakova;

public class CinemaStatistics {

    public static int calculateTotalIncome(char[][] cinemaSeats, int totalSeats) {
        int totalIncome;
        if (totalSeats <= 60) {
            totalIncome = totalSeats * 10;
        } else {
            int firstHalfSeats = cinemaSeats.length / 2;
            int secondHalfSeats = cinemaSeats.length - firstHalfSeats;
            totalIncome = (firstHalfSeats * cinemaSeats[0].length * 10)
                    + (secondHalfSeats * cinemaSeats[0].length * 8);
        }
        return totalIncome;
    }

    public static int calculateCurrentIncome(char[][] cinemaSeats, int totalSeats, int counter) {
        int currentIncome;
        if (totalSeats <= 60) {
            currentIncome = counter * 10;
        } else {
            int firstHalfSeats = cinemaSeats.length / 2;
            int firstHalfCounter = 0;
            int secondHalfCounter = 0;

            for (int i = 0; i < firstHalfSeats; i++) {
                for (int j = 0; j < cinemaSeats[0].length; j++) {
                    if (cinemaSeats[i][j] == 'B') {
                        firstHalfCounter++;
                    }
                }
            }

            for (int i = firstHalfSeats; i < cinemaSeats.length; i++) {
                for (int j = 0; j < cinemaSeats[0].length; j++) {
                    if (cinemaSeats[i][j] == 'B') {
                        secondHalfCounter++;
                    }
                }
            }

            currentIncome = (firstHalfCounter * 10) + (secondHalfCounter * 8);
        }
        return currentIncome;
    }

    public static void makeStatistics(char[][] cinemaSeats) {
        int counter = 0;
        for (int i = 0; i < cinemaSeats.length; i++) {
            for (int j = 0; j < cinemaSeats[0].length; j++) {
                if (cinemaSeats[i][j] == 'B') {
                    counter++;
                }
            }

        }
        System.out.println("Number of purchased tickets: " + counter);
        int totalSeats = cinemaSeats.length * cinemaSeats[0].length;
        float percentOfOccupancy = (float) (100 * counter) / totalSeats;
        System.out.printf("Percentage: %.2f", percentOfOccupancy);
        System.out.println("%");
        System.out.println("Current income: $" + calculateCurrentIncome(cinemaSeats, totalSeats, counter));
        System.out.println("Total income: $" + calculateTotalIncome(cinemaSeats, totalSeats));
    }
}
