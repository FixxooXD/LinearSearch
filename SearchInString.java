import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {

        String str = "Raj_Fixxoo";
        //Scanner in = new Scanner(System.in);
        char n = 'a';
        // for (int i=0;i<arr.length;i++){

        System.out.println(search(str,n));
        System.out.println(str.charAt(3));

    }static boolean search(String str,char n){
        for (int i=0;i<str.length();i++){
            if (n == str.charAt(i)){
                return true;
            }
        }return false;
    }
}



//        static int has(int[] arr, int n){
//            // int[] num= new  int[arr.length];
//            for (int i=0;i<arr.length;i++){
//                if (arr[i] == n){
//                    return i;
//                }
//            }return Integer.MAX_VALUE;
//        }
//    }

