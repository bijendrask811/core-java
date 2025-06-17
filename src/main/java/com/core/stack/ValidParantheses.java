package com.core.stack;

import java.util.Stack;

public class ValidParantheses {


    public static void main(String[] args) {

        String str = "()";

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '{' || ch =='[' || ch == '('){
                stack.push(ch);
            }else if((stack.peek().equals('{') && ch == '}') || (stack.peek().equals('[') && ch == ']')||(stack.peek().equals('(') && ch == ')')){
                stack.pop();
            }else {
                System.out.println("It is not a valid parenthesis");
            }
        }

        if(stack.empty()){
            System.out.println("It's a valid parenthesis");
        }

    }
}
