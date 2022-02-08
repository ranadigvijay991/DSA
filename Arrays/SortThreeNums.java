public class SortThreeNums {
    public static void sort012(int arr[], int n)
    {
    int num = 0;
       for(int i=0;i<3;i++){
           
           for(int j=0;j<n;j++){
               if (arr[j]==num){
                   System.out.print(arr[j]+" ");
               }
            num=num+1;
           }
       }
}
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        int n = arr.length;
        
        sort012(arr, n);
    }
}
