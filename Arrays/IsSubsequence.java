package Arrays;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int count = 0;
        if(s.length()==0){
            return true ;
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(count)){
                 count++;
                if(count==s.length()){
                    return true;
        }
                
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "avldshbelvc";
        boolean c = isSubsequence(s,t);
        System.out.println(c);
    }
}
