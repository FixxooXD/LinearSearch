import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,5,44,9,75,5,3,6};
        Scanner in = new Scanner(System.in);
        System.out.print("what are you Searching for: ");
        int item= in.nextInt();
        System.out.print("Starting index to start searching: ");
        int start =in.nextInt();
        System.out.print("Ending index to end searching: ");
        int end = in.nextInt();

        System.out.println( Search(arr,item,start,end));
    }
    static boolean  Search(int[] arr, int item,int start,int end){
        for (int i=start; i<end; i++){
            if (arr[i] == item){
                return true;
            }
        }return false;
    }
}

//    static boolean has(int[] arr, int n,int start,int end){
//        for (int i=start;i<end;i++){
//            if (arr[i] == n){
//                return true;
//            }
//        }return false;
//    }
//}
