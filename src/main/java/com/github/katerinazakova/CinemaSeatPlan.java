package com.github.katerinazakova;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CinemaSeatPlan {
    private int rows;
    private int seats;
    private char[][] cinemaSeats;

    public CinemaSeatPlan(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
        this.cinemaSeats = new char[rows][seats];
        showEmptySeats(cinemaSeats);
    }

    private void showEmptySeats(char[][] cinemaSeats) {
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

}
