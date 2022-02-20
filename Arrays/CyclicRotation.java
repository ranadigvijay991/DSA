package Arrays;

public class CyclicRotation 
{

    public static void rotate(int arr[], int n)
    {
       //Place the array in a new array with 1 space difference
        int[] array = new int[n+1];
        for(int i=0;i<n;i++){
            array[i+1] = arr[i];
        }
        array[0] = arr[n-1];
        for(int i=0; i<array.length-1;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        rotate(arr,n);
    }
}
