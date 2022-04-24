package main.java.exercise;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-04-22 {TIME}
 */

public class MatrixDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] original = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                original[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (j < rows - 1) {
                    System.out.print(original[j][i] + " ");
                } else {
                    System.out.print(original[j][i]);
                }
            }
            System.out.println();
        }
    }
}
