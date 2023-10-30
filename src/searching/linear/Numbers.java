package searching.linear;

public class Numbers {

    static int linearSearch1(int[] arr, int target) {
        if(arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0)
            return -1;

        for (int element: arr) {
            if(element == target)
                return element;
        }

        return Integer.MIN_VALUE;
    }

    static int linearSearchInRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0)
            return -1;

        for (int i = start; i < end; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, -9, 39, -61, 199, 57, -1};
        System.out.println(linearSearch1(arr, 329));
        System.out.println(linearSearch2(arr, -12));
        System.out.println(linearSearchInRange(arr, 199, 2, 3));
    }
}
