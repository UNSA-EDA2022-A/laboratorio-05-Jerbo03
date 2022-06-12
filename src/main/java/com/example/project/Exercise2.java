package com.example.project;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.existenDuplicados(s));
        }
    }

    public boolean existenDuplicados(String str) {
        MyStack<Character> stack = new LinkedListStack<>();
        int estado = 0; // 0 = bien, 1 = "((...", 2 = "((...))" => false
        for (int i = 0; i < str.length(); i++) {
            if (estado == 0)
                if (stack.top().equals('(') && str.charAt(i) == '(')
                    estado = 1;
            if (estado == 1 && str.charAt(i) == ')') {
                if (stack.top().equals(')'))
                    return false;
                else
                    estado = 0;
            }
            stack.push(str.charAt(i));
        }
        return true;
    }
}
