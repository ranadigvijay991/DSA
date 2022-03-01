package Arrays;
class CountingBits{
    public static int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            //Integer first = i;
            String bin = Integer.toBinaryString(i);
            int count = 0;
            count = bin.replaceAll("[^1]", "").length();
            arr[i] = count;
        }
        return arr;
    }
    public static void main(String[] args) {
    int n = 5;
    int[] arr = countBits(n);
    for(int i:arr){
        System.out.println(i);
    }
    }
}