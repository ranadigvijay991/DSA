package Arrays;

import java.util.Scanner;

public class ReverseArray{
    public static void reverse(int[] array){
        int l = array.length;
        for (int i= l-1; i>=0;i--){
            System.out.println("Reversed Array : ");
            System.out.println(array[i]+"  ");
        }


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
        
        reverse(arr);
        
    }

}