package Stacks;

import java.util.Stack;

public class PushPop {
    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> stack = new Stack<Integer>();
            int iter =0;
            for(int i=0;i<pushed.length;i++){
                
                    stack.push(pushed[i]);
                    while(!stack.empty() && popped[iter] == stack.peek()){
                        stack.pop();
                        iter++;
                    }
                
            }
           
            System.out.print(stack);
            if(stack.empty()){
                return true;
            }
            return false;
        }
    }
    
}
