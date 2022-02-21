package Arrays;

import java.util.ArrayList;

public class Factorial {
   
    public static void main(String[] args) {
        long N= 20;
         long fact = 1;
         long j=1;
        while( j <= N ){  
            fact = fact * j;   
            j++; //increment i by 1   
        }     
        System.out.println(fact);
        String s =Long.toString(fact);
        ArrayList<Long> lis = new ArrayList<Long>();
        for(int i=0;i<s.length();i++){
            lis.add(fact%10);
            fact = fact/10;
        }
        ArrayList<Long> rev = new ArrayList<Long>();
        for(int i=lis.size()-1;i>=0;i--){
            rev.add(lis.get(i));
        }
        for(Long i:rev){
            System.out.print(i+" ");
        }
    }
}

    

