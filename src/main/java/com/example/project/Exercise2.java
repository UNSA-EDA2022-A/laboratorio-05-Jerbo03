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
        for (int i = 0; i < str.length(); i++) { // Itineramos por el array
            if (str.charAt(i) == ')') { // Si encontramos un parentesis de cierre
                char last = stack.pop(); // Eliminamos el contenido que encierra
                if (last == '(') return True; // Solo si no encierra ningun contenido, es porque su contenido ya pertenecia a otro par de parentesis
                while (last != '(') last = stack.pop(); // Eliminamos el contenido que encierra
                continue; // Y no agregamos nada
            }
            stack.push(str.charAt(i)); // Si no es un parentesis de cierre agregamos el caracter
        }
        return false;
    }
}
