public class SortThreeNums {
    public static void sort012(int a[], int n)
    {
       for(int i=0;i<3;i++){
           int num = 0;
           for(int j=0;j<n;j++){
               if (a[j]==num){
                   System.out.print(a[j]+" ");
               }
            num++;
           }
       }
}
}
