package com.company.Easy.ValidParenthese;

import java.util.Stack;

/**
 * Created by cuongnghiem on 21/11/2021
 * https://leetcode.com/problems/valid-parentheses/
 **/

public class ValidParenthese {

    public static void main(String[] args) {
        ValidParenthese obj = new ValidParenthese();
        System.out.println(obj.isValid("{{{[[(()))]]}}}"));
    }

    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                myStack.push(s.charAt(i));
            else if (myStack.isEmpty())
                return false;
            else if (s.charAt(i) == ')' && myStack.peek() == '(')
                myStack.pop();
            else if (s.charAt(i) == ']' && myStack.peek() == '[')
                myStack.pop();
            else if (s.charAt(i) == '}' && myStack.peek() == '{')
                myStack.pop();
            else
                return false;
        }
        if (myStack.isEmpty())
            return true;
        return false;
    }
}
