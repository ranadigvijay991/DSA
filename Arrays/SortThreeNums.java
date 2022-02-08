public class SortThreeNums {
    public static void sort012(int a[], int n)
    {
    int num = 0;
       for(int i=0;i<3;i++){
           
           for(int j=0;j<n;j++){
               if (a[j]==num){
                   System.out.print(a[j]+" ");
               }
            num=num+1;
           }
       }
}
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        sort012(arr, arr.length);
    }
}
