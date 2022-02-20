package Arrays;

class NegativeElements{
    public static void sort(int[] arr){
        int j = 0, temp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
       
    }
    public static void print(int[] arr){
        for(int i: arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        sort(arr);
        print(arr);

    }

}