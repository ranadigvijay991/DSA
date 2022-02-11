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
   
}
