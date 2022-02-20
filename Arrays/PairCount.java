package Arrays;

public class PairCount {
    public static void find(int[] arr, int n,int k){
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 1};
        int k = 6;
        int n = arr.length;
        find(arr,n,k);
    }
}
