package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class KthSmallest {
    public static int Smallest(int[] arr,int k){
        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[k-1];
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
