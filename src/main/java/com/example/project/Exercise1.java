package com.example.project;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.esBalanceado(s));
        }
    }

    public boolean esBalanceado(String s) {
        MyStack<Character> stack = new LinkedListStack<>();
        if (s.length() % 2 != 0) return false; // Debe existir un numero par de caracteres
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                char top = stack.pop();
                if(!(
                    (s.charAt(i) == ')' && top == '(') ||
                    (s.charAt(i) == '}' && top == '{') ||
                    (s.charAt(i) == ']' && top == '[')
                    )) {
                    return false;
                }
            }
        }
        return true;
    }
}
