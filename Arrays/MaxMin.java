package Arrays;


import java.util.Scanner;
public class MaxMin {
    public static int Max(int[] array){
        int max =  array[0];
        for (int i=0; i<array.length;i++){
            if (max<array[i]){
                max = array[i];
            } 
        }
        return max;

    }
    public static int Min(int[] array){
        int min =  array[0];
        for (int i=0; i<array.length;i++){
            if (min>array[i]){
                min = array[i];
            } 
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<len ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Maximum is : "+ Max(arr));
        System.out.println("Minimum is : "+ Min(arr));
    }
}
