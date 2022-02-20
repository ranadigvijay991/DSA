package Arrays;

import java.util.ArrayList;

public class CommonElements {
    public static ArrayList<Integer> common(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // This code doesn't work for duplicate elements
        
        ArrayList<Integer> arrli = new ArrayList<Integer>(n1);
         for(int i=0;i<n1;i++){
                for(int j=0;j<n2;j++){
                    for(int k=0;k<n3;k++){
                        if(A[i]==B[j] && B[j]==C[k] && C[k]==A[i]){
                            arrli.add(A[i]);
                        }
                  
                    }
                }
            }
        return arrli;

    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = {3,4,5,6};
        int[] C = {5,6,7,8};
        ArrayList<Integer> arr = common(A,B,C,A.length,B.length,C.length);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
