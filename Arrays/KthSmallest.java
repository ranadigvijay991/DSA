package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class KthSmallest {
    public static int Smallest(int[] array,int k){
        int[] sorted = new int[array.length];
        sorted = Arrays.sort(array, 0, 5);
        return sorted[k];
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
        int k;
        System.out.println("Enter K : ");
        k = sc.nextInt();
        sc.close();
        System.out.println(Smallest(arr,k));
    }
}
