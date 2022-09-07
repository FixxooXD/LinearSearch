 class SearchEvendigits {
    public static void main(String[] args) {
        int[] arr = {12,5,65,95,56,548,8555};
        System.out.println(evenDigits(arr));

    }
    static int evenDigits(int[] arr){
        int count = 0;
        for (int i=0;i<arr.length;i++){
            int ct=0;
            while (arr[i]>0){
                arr[i]=arr[i]/10;
                ct ++;
            }if(ct%2==0){
                count++;
            }
        }return count;
    }
}
