package com.bl;

public class SnakesAndLadders {
    static final int START_POSITION = 0;
    static final int NO_PLAY = 0;
    static final int IF_LADDER = 1;
    static final int IF_SNAKE = 2;
    static int currentPosition = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snakes and Ladders Game");
        int dieNum = (int) (Math.random() * 10) % 6 + 1;
        int option = (int) (Math.random() * 10) % 3;
        int dienum = 0;
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
        System.out.println(currentPosition);
    }
}

