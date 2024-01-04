package TwoDArray;

public class Transpose {

    static void transpose(int[][] arr, int row, int col) {
        int[][] ans = new int[col][row];

        for(int i=0; i<col; i++) {
            for(int j=0; j<row; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        display(ans);
    }

    static void transposeInPlace(int[][] arr, int row, int col) {
        // In place can be done for same number of rows and cols
        for(int i=0; i<row; i++) {
            for(int j=i; j<col; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        display(arr);
    }

    static void display(int[][] arr) {
        for(int[] row: arr) {
            System.out.print("[");
            for(int col: row) {
                System.out.print(col + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
        };

        int[][] arr2 = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
        };

//        transpose(arr1, arr1.length, arr1[0].length);
        transposeInPlace(arr2, arr2.length, arr2[0].length);
    }
}
