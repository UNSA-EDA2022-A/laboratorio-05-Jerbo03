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
        if (str.length() % 2 != 0) return false; // Debe existir un numero par de caracteres
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            } else {
                char top = stack.pop();
                if(!(
                    (str.charAt(i) == ')' && top == '(') ||
                    (str.charAt(i) == '}' && top == '{') ||
                    (str.charAt(i) == ']' && top == '[')
                    )) {
                    return false;
                }
            }
        }
        return true;
    }
}
