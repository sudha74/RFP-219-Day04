package com.bl;

public class SnakesAndLadders {
    static final int START_POSITION = 0;
    static final int NO_PLAY = 0;
    static final int IF_LADDER = 1;
    static final int IF_SNAKE = 2;
    static int currentPosition = 0;
    static int die = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snakes and Ladders Game");
        while (currentPosition < 100) {
            int dieNum = (int) (Math.random() * 10) % 6 + 1;
            int option = (int) (Math.random() * 10) % 3;
            int die = 0;
            if (option == IF_LADDER) {
                currentPosition += dieNum;
            } else if (option == IF_SNAKE) {
                currentPosition -= dieNum;
            } else if (option == NO_PLAY) {
                System.out.println("No Play");
            }
            if (currentPosition < START_POSITION) {
                currentPosition = 0;
            }
            if (currentPosition > 100) {
                currentPosition -= dieNum;
            }
            System.out.println("currentPosition is : " + currentPosition);
            die++;
        }
        System.out.println("Total number of times die rolled are : " + die);
    }

}

