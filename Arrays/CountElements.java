package Arrays;

import java.util.*;

class CountElements{
    public static List<Integer> solve(int[] nums){
        int n = nums.length;
        int[] count = new int[n];
        for(int i=0;i<n;i++){
            int current = nums[i];
            for(int j=0;j<n;j++){
                if (nums[j]==current) {
                    count[i]++;
                }
            }
        }
        for(int i: count){
            System.out.println(i);
        }
        int ap = n/3;
        Set<Integer> lis = new LinkedHashSet<Integer>();
        for(int i=0;i<n;i++){
            if(count[i]>ap){
                
                lis.add(nums[i]);
            }
        }
        
        List<Integer> list= new ArrayList<Integer>(lis);
        //list.addAll(lis);
        
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        solve(nums);
    }
}