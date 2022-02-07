public class Union {
    public static void solve(int[] a, int[]b, int n, int m){
        //int[] array = new int[m+n];
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j])
                System.out.print(a[i++] + " ");
            else if (b[j] < a[i])
                System.out.print(b[j++] + " ");
            else {
                System.out.print(b[j++] + " ");
                i++;
            }
        }

        while (i < m)
            System.out.print(a[i++] + " ");
        while (j < n)
            System.out.print(b[j++] + " ");
    }
    public static void main(String[] args) {
        int[] a = {1,6,3,5,2};
        int[] b = {2,5,7,9};
        int n = a.length;
        int m = b.length;
        solve(a,b,n,m);
    }
}
