package Arrays;
import java.util.*;
public class CheckZeroSub {
    public static boolean check(int[] arr, int  n){
        Set<Integer> s = new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0 || arr[i]==0 || s.contains(sum)){
                return true;
                //s.add(sum);
            }
             s.add(sum);
       
        }
         return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,-1,3,-1,4};
        int n = arr.length;
        System.out.println(check(arr,n));


    }
}
