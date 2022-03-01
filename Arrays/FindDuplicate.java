package Arrays;

import java.util.*;

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num))
                return num;
            seen.add(num);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int n = findDuplicate(nums);
        System.out.println(n);
    }

    
}
