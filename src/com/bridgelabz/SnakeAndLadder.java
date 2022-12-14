package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    static int position = 0;
    static final int IS_LADDER = 1;
    static final int IS_SNAKE = 2;
    static final int NO_PLAY = 0;
    static int totalDieRoll = 0;

    public static int dieRoll() {
        Random random = new Random();
        int dieNumber = random.nextInt(6) + 1;
        totalDieRoll++;
        return dieNumber;
    }
    public static void start(int dieNumber) {
        int option = (int) (Math.random() * 10) % 3;
        System.out.println("Option:- " + option);
        switch (option) {
            case IS_LADDER:
                System.out.println("You got ladder");
                if (position+dieNumber<=100)
                    position = position + dieNumber;
                break;
            case IS_SNAKE:
                System.out.println("you got snake");
                position = position - dieNumber;
                break;
            case NO_PLAY:
                System.out.println("No Play");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulation Program");
        System.out.println("Current Position:- " + position);
        while (position!=100){
            int dieNumber = dieRoll();
            start(dieNumber);
            System.out.println("Die Number is:- " + dieNumber);
            System.out.println("Current Position:- " + position);
        }
        System.out.println("Number of times die rolled:- " + totalDieRoll);
    }
}
