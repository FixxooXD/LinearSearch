public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 5, 67, 5, 43, 55};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
//            int max = arr[0];
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
//            int max = arr[0];
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;


    }
}


