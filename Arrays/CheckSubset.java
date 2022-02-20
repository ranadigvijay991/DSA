package Arrays;

public class CheckSubset {
    public static String solve( int[] a1, int[] a2, int n, int m) {
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (a2[j] == a1[i]){
                    count++;
                }
                
            }
        }
        if (count== m)
            return "Yes";
        else
            return "No";
        
    }
    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5};
        int a2[] = {2,3,4};
        int n = a1.length;
        int m = a2.length;
        String ans = solve(a1, a2, n, m);
        System.out.println(ans);
    }
}
