package Arrays;
class CountElements{
    public static void solve(int[] nums){
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
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        solve(nums);
    }
}