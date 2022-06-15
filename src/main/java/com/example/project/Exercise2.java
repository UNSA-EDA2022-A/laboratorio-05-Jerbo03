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
        boolean admitir = true;
        for (int i = 0; i < str.length(); i++) { // Itineramos por el array
            if (str.charAt(i) == ')') { // Si encontramos un parentesis de cierre
                char last = stack.pop(); // Eliminamos el contenido que encierra
                if (last == '(') return true; // Solo si no encierra ningun contenido, es porque su contenido ya pertenecia a otro par de parentesis
                while (last != '(') last = stack.pop(); // Eliminamos el contenido que encierra
                // Como se esta eliminando el "relleno" del parentesis, permitir mas si es que no los hay ya
                admitir = (stack.top() == '('); // Comprobar que el ultimo caracter no sea relleno
                continue; // Y no agregamos nada
            }
            if (!(str.charAt(i) == '(' || admitir)) continue; // Si no es un parentesis y ya se adminitio otro "relleno", no agregrar
            admitir = (str.charAt(i) == '('); // Si se acepta "relleno", agregarlo pero bloquear otros caracteres
            stack.push(str.charAt(i)); // Agregar si es "(", no ")", y si no hay otros caracteres de "relleno"
        }
        return false;
    }
}
