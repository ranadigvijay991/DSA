import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();  
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                 stk.push(s.charAt(i));
            }
            
            else if (!stk.empty() && stk.peek()=='(' && s.charAt(i)== ')'){
                //System.out.println("here") ;
                stk.pop();
            }
            else if (!stk.empty() && stk.peek()=='[' && s.charAt(i)== ']'){
                stk.pop();
            }
            else if (!stk.empty() && stk.peek()=='{'  &&  s.charAt(i)== '}'){
                stk.pop();
            }
           // System.out.println(stk.peek()) ;
            //System.out.println(s.charAt(i)) ;
            else return false;
            
        }
        
        if(stk.empty()) return true;
        return false;
       
    }
}