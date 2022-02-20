package Arrays;

public class SortThreeNums {
    public static void sort012(int arr[], int n)
    {
        int zeros=0;
        int ones=0;
        int twos=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
            else if(arr[i]==1){
                ones++;
            }
            else{
                twos++;
            }
       
        }
        for(int j=0; j<zeros;j++){
           System.out.print(0+" ");
       }
       for(int k=0; k<ones;k++){
        System.out.print(1+" ");
    }
    for(int l=0; l<twos;l++){
        System.out.print(2+" ");
    }
}
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        int n = arr.length;
        
        sort012(arr, n);
    }
}
