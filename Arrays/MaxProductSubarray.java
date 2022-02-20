package Arrays;

public class MaxProductSubarray {
    public static int solution(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for(int i=0;i<n;i++){
            int current = arr[i];
            for(int j=i+1;j<n;j++){
                max = Math.max(max, current);
                current = current*arr[j];
            }
            max = Math.max(max, current);


        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, -3, 0, 7, -8, -2 };
        System.out.println(solution(arr));  
    }

    
}
