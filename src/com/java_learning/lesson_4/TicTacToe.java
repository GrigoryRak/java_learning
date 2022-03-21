package com.java_learning.lesson_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 7;
    private static final char DOTS_TO_WIN = 4;
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '\u2022';
    private static final char[][] MAP = new char[SIZE][SIZE];

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (isWin(DOT_X)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isDraw()) {
                break;
            }

            computerTurn();
            printMap();

            if (isWin(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isDraw()) {
                break;
            }
        }
    }

    private static boolean isDraw() {
        if (isMapFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static void humanTurn() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите поочередно координаты хода:");
            System.out.print("Введите координату X: ");
            x = scanner.nextInt() - 1;
            System.out.print("Введите координату Y: ");
            y = scanner.nextInt() - 1;
            System.out.println();

            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                System.out.println("Данные введены некорректно");
            } else if (MAP[x][y] != DOT_EMPTY) {
                System.out.println("Клетка уже занята");
            } else {
                break;
            }

        } while (true);

        MAP[x][y] = DOT_X;
    }

    private static boolean isWin(char symbol) {
        if (checkLineAndColumn(symbol)) {
            return true;
        } else {
            return checkDiagonal(symbol);
        }
    }

    private static boolean checkLineAndColumn(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int rowCount = 0;
            int colCount = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[j][i] == symbol) {
                    rowCount++;
                } else {
                    rowCount = 0;
                }
                if (MAP[i][j] == symbol) {
                    colCount++;
                } else {
                    colCount = 0;
                }
                if (rowCount == DOTS_TO_WIN || colCount == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonal(char symbol) {
        int mainDiagonal = 0;
        int saidDiagonal = 0;
        for (int i = 0; i < SIZE; i++) {
            if (MAP[i][i] == symbol) {
                mainDiagonal++;
            }
            if (MAP[i][MAP.length - 1 - i] == symbol) {
                saidDiagonal++;
            }
            if (mainDiagonal == DOTS_TO_WIN || saidDiagonal == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void computerTurn() {
        int x;
        int y;
        Random random = new Random();
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
            System.out.println("Компьютер подобрал координаты: X: " + x + " и Y: " + y);
        } while (MAP[x][y] != DOT_EMPTY);
        MAP[x][y] = DOT_O;
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(MAP[i], DOT_EMPTY);
        }
    }

    private static void printMap() {
        printHeader();
        printBody();
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            if (i == 0) {
                System.out.print("   ");
            } else {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    private static void printBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}