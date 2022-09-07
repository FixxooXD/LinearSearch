import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {                   //{1,5,8,6}[0], [1]{2,3,4,44},[2]{12,13,10,49}
                {1, 5, 8, 6},
                {2, 3, 77, 44},
                {12, 13, 10, 49}
        };
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        System.out.println(max(arr));
//        System.out.println(arr[2][2]);\
//        System.out.println(Arrays.toString(max(arr)));


       // System.out.println(Arrays.toString(search(arr, n)));
    }
        static int max(int[][] arr){
        int  max  = arr[0][0];
        for(int i =0;i<arr.length;i++){
                for (int j=0;j<arr[i].length;j++){
                    if (arr[i][j]>max){
                        max  = arr[i][j];
                    }
                }
            }return max;
    }

//   FOR SEARCH
//    static int[] search(int[][] arr,int n){
//        for(int i =0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                if (arr[i][j] ==n){
//                   return  new int[] {i,j};
//                }
//            }
//        }return new int[] {-1,-1};
//    }
//    static boolean search(int[][] arr,int n){
//        for(int i =0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                if (arr[i][j] ==n){
//                    return true;
//                }
//            }
//        }return false;
//    }
}
