public class additionOf2Darr {
    public static void main(String[] args) {
        int[][] arr  = {{1,2,10},
                        {5,2,5}};
        System.out.println(wealth(arr));
    }
    static int wealth(int[][] arr){
        int maxWelth = 0;
        for(int i =0;i<arr.length;i++){

            int sum =0;
         //  int maxWelth = 0;
            for (int j=0;j<arr[i].length;j++){
               sum = sum +arr[i][j];
            }if (maxWelth<sum){
                maxWelth =sum;
            }
        }return maxWelth;
    }
}
