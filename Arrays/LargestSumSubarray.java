package Arrays;

public class LargestSumSubarray {
    public static void solve(int[] arr){
        int min = Integer.MIN_VALUE;
        int s = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            s = s+arr[i];
            if(min<s){
                min = s;
            }
            if(s<0){
                s = 0;
            }
        }
        System.out.println(s);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        solve(arr);

    }
}
