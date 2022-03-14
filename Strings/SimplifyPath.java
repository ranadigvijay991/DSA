package Strings;

import java.util.Stack;

public class SimplifyPath {
    public static String solve(){
        Stack<String> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] p =path.split("/");
        
        for(int i=0;i<p.length;i++){
            if(!s.isEmpty()  && p[i].equals("..")) s.pop();
            else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
                s.push(p[i]);
        }
        
       
    }
}
