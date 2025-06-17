package com.core.stack;

import java.util.Stack;

public class pushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottomFun(4,s);

        System.out.println(s);
    }

    private static void pushAtBottomFun(int data, Stack<Integer> s) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottomFun(data,s);
        s.push(top);
    }
}
