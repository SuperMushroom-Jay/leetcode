package isValid_20;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if(s==null||s.length()==0)
            return false;
        Stack<Character> stack=new Stack<Character>();
        char ch;
        char match;
        boolean isMatch=true;
        for(int i=s.length()-1;i>=0&&isMatch;i--){
            ch=s.charAt(i);
            if(ch==')'||ch==']'||ch=='}'){
                stack.push(ch); //入栈
            } else if(!stack.empty()){
                match=stack.pop();
                switch (match){
                    case ')':{
                        if(ch!='(')
                            isMatch=false;
                    }break;
                    case ']':{
                        if(ch!='[')
                            isMatch=false;
                    }break;
                    case '}':{
                        if(ch!='{')
                            isMatch=false;
                    }break;
                    default:break;
                }
            }else {
                isMatch=false;
            }
        }
        return isMatch&&stack.empty();
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.isValid(")"));
    }
}
