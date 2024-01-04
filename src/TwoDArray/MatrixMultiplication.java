package TwoDArray;

import java.util.Scanner;

public class MatrixMultiplication {
    static Scanner sc = new Scanner(System.in);

    static int[][] multiply(int[][] arr1, int[][] arr2, int row, int col, int c1) {
        int[][] ans = new int[row][col];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return ans;
    }

    static int[][] takeInputs(int row, int col) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = takeInputs(r1, c1);

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2 = takeInputs(r2, c2);

        if(c1 != r2){
            System.out.println("Invalid input, can't multiply");
            return;
        }

        // Multiply
        int[][] ans = multiply(arr1, arr2, r1, c2, c1);

        for (int[] row: ans) {
            System.out.print("[");
            for (int col: row) {
                    System.out.print(" " + col + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}

//  3*2 multiply 2*3
//  [2   1]      [1  -2   1]
//  [3   2]      [2   1   3]
//  [1   1]
//  3 2 2 1 3 2 1 1 2 3 1 -2 1 2 1 3
