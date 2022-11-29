package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    static int position = 0;

    public static void dieRoll() {
        Random random = new Random();
        int dieNumber = random.nextInt(6) + 1;
        System.out.println("Die Number is:- " + dieNumber);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulation Program");
        System.out.println("Current Position:- " + position);
        dieRoll();
    }
}
