package Lesson_3;


import java.util.Random;
import java.util.Scanner;




public class lesson_3_homework {
    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            humanTurn();
            printField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Human wins!");
                break;
            }

            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }

            aiTurn();
            printField();
            if (checkWin(DOT_AI)) {
                System.out.println("Computer wins!");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }


        }


    }

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '_';

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char[][] field;

    private static void initField() {
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }

    }

    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeY * 2 + 1; i++)
            System.out.print((i % 2 == 0) ? "-" : i / 2 + 1);
        System.out.println();

        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++)
                System.out.print(field[i][j] + "|");
            System.out.println();

        }
        for (int i = 0; i <= fieldSizeX * 2 + 1; i++)
            System.out.print("-");
        System.out.println();
    }

    private static void humanTurn() {
        int x;
        int y;

        do {
            System.out.print("Введите координаты ( X и Y) от 1 до 3 через пробел >>");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        }
        while (!isCellValid(x, y) || !isCellEmpty(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        }
        while (!isCellValid(x, y) || !isCellEmpty(x, y));
        field[y][x] = DOT_AI;
    }

    private static boolean checkWin(char c) {
        int counter = 0;
        // проверка победы по горизонтали
        for (int i = 0; i < fieldSizeY; i++) {
            counter = 0;
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[i][j] == c) {
                    counter++;
                    if (counter == fieldSizeX) {
                        return true;
                    }
                } else break;
            }
        }
        // проверка по вертикали
        for (int i = 0; i < fieldSizeX; i++) {
            counter = 0;
            for (int j = 0; j < fieldSizeY; j++) {
                if (field[j][i] == c) {
                    counter++;
                    if (counter == fieldSizeY) {
                        return true;
                    }
                } else {
                    break;
                }

            }
            //проверка победы по диагонали вправо-вниз
            counter = 0;
            for (int j = 0; j < fieldSizeY; j++) {
                if (field[j][i] == c) {
                    counter++;
                    if (counter == fieldSizeY) {
                        return true;
                    }
                } else
                    break;
            }
            // проверка победы по диагонали вправо-вверх
            counter = 0;
            for (i = 0; i < fieldSizeX; i++) {
                if (field[i][fieldSizeX - 1 -i] == c) {
                    counter ++;
                    if (counter == fieldSizeX) {
                        return true;
                    }
                }
                else
                    break;


            }
        }
        return false;
    }





    private static boolean isCellEmpty(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static boolean isCellValid(int x, int y) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;

    }


    private static boolean isDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY)
                    return false;

            }
        }
        return true;
    }
}

