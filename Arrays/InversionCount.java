public class InversionCount {
    public static void solve(int[] arr, int n){
        int Count = 0;
        int invCount=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    Count++;
                }
                
            }
        }
        System.out.println(Count);
    }
    public static void main(String[] args) {
        int[] arr = {468, 335, 1, 170, 225, 479, 359, 463, 465, 206, 146, 282, 328, 462, 492, 496, 443 ,328, 437, 392, 105, 403, 154, 293, 383, 422, 217 ,219 ,396 ,448 ,227 ,272 ,39 ,370, 413 ,168 ,300 ,36 ,395 ,204, 312, 323};
        solve(arr,arr.length);
    }
}
