package HW4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    private static char[][] tiles;
    private static final int SIZE = 5;
    private static final int WIN_SYMBOL = 4;
    private static final int ACTION_SUM = SIZE * SIZE;
    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static int actionCounter = 0;
    private static char currentDot;

    public static void main(String[] args) {
        fillMap();
        printMap();

        while (true) {
        currentDot = DOT_X;
        humanPlayer();
        printMap();
        if (isContinue()) {
            System.out.println(" Player won ");
            break;
        }
        actionCounter++;

        currentDot =DOT_O;
        actionCounter++;
            if (checkGameLoop()){
                System.out.println(" Friendship won ");
                break;
            }

            aiPlayer();
        printMap();
            if (isContinue()) {
                System.out.println(" Ai won ");
                break;
            }
        }

    }

    private static void fillMap() {
        tiles = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tiles[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        System.out.printf("   ");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%2d ", i + 1);
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%2d ", i + 1);
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%2c ", tiles[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }

    private static int[] humanInput() {
        int input[] = new int[2];

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        input[0] = scanner.nextInt() - 1;
        input[1] = scanner.nextInt() - 1;
        return input;
    }

    private static void humanPlayer() {
        int y;
        int x;

        do {
            System.out.printf("Ходит человек [%c]. Введите Y X: ", currentDot);
            int[] input = humanInput();
            y = input[0];
            x = input[1];
        } while (!checkAction(y, x));

        tiles[y][x] = currentDot;
    }

    private static void aiPlayer() {
        int y;
        int x;

        System.out.printf("Ходит AI [%c]", currentDot);

        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!checkAction(y, x));

        System.out.printf(" (y: %d, x: %d)\n", y + 1, x + 1);

        tiles[y][x] = currentDot;
    }

    private static boolean checkAction(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        if (DOT_EMPTY == tiles[y][x]) return true;
        return false;
    }

    private static boolean isContinue() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (findRightUp(i, j)) return true;
                if (findRight(i, j)) return true;
                if (findRightDown(i, j)) return true;
                if (findDown(i, j)) return true;
            }
        }
        return false;
    }

    private static boolean findRightUp(int y, int x) {
        for (int j = 0; j < WIN_SYMBOL; j++) {
            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || currentDot != tiles[y][x]) return false;
            y--;
            x++;
        }
        return true;
    }

    private static boolean findRight(int y, int x) {
        for (int j = 0; j < WIN_SYMBOL; j++) {
            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || currentDot != tiles[y][x]) return false;
            x++;
        }
        return true;
    }

    private static boolean findRightDown(int y, int x) {
        for (int j = 0; j < WIN_SYMBOL; j++) {
            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || currentDot != tiles[y][x]) return false;
            y++;
            x++;
        }
        return true;
    }

    private static boolean findDown(int y, int x) {
        for (int j = 0; j < WIN_SYMBOL; j++) {
            if (y < 0 || y >= SIZE || x < 0 || x >= SIZE || currentDot != tiles[y][x]) return false;
            y++;
        }
        return true;
    }

   private static boolean checkGameLoop() {
       if (actionCounter >= ACTION_SUM) return true;
       return false;
   }
}