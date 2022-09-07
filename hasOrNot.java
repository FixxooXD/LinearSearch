import java.util.Scanner;

public class hasOrNot {

    public static void main(String[] args) {
        int[] arr ={1,4,6,3,7,8};
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       // for (int i=0;i<arr.length;i++){


        // middle
//        System.out.println(arr.length/2);

        System.out.println(has(arr,n,0,2));

    }


    static int has(int[] arr, int n,int start,int end){
       // int[] num= new  int[arr.length];
        for (int i=start;i<end;i++){
            if (arr[i] == n){
                return i;
            }
        }return Integer.MAX_VALUE;
    }
}
