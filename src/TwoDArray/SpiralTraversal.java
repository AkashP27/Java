package TwoDArray;

public class SpiralTraversal {

    private static void spiralTraverse(int[][] arr, int minRow, int minCol, int maxRow, int maxCol, int totalNumber) {
        int count = 0;
        while(count < totalNumber) {
            // left
            for (int i = minRow, j = minCol; i <= maxRow && count < totalNumber; i++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minCol++;

            // bottom
            for (int j = minCol, i = maxRow; j <= maxCol && count < totalNumber; j++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxRow--;

            // right
            for (int i = maxRow, j = maxCol; i >= minRow && count < totalNumber; i--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxCol--;

            // top
            for (int j = maxCol, i = minRow; j >= minCol && count < totalNumber; j--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minRow++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
        };

        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length - 1;
        int maxCol = arr[0].length - 1;
        int totalNumber = 25;

        spiralTraverse(arr, minRow, minCol, maxRow, maxCol, totalNumber);
    }

}
