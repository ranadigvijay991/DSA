package Arrays;
public class ReverseArray{
    public static void reverse(int[] array){
        int l = array.length;
        for (int i= l-1; i>=0;i--){
            System.out.println(array[i]+"  ");
        }


    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr);
        
    }

}