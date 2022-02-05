public class Union {
    public static void solve(int[] a, int[]b, int n, int m){
        int[] array = new int[m+n];
        for(int i=0;i<n;i++){
            //int temp = a[i];
            for(int j=0; j<m+n;j++){
                if(array[j]!=a[i]){
                    array[j]=a[i];
                    break;
                }
                
            }
        }
        for( int i : array){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] a = {1,6,3,5,2};
        int[] b = {2,5,7,9};
        int n = a.length;
        int m = b.length;
        solve(a,b,n,m);
    }
}
