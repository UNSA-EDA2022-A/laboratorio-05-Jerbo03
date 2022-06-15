package com.example.project;

public interface MyStack<T extends Comparable<T>> {

    // Metodos que modifican la pila
    public void push(T v); // Poner un valor en la parte superior de la pila

    public T pop(); // Elimina y devuelve el valor en la parte superior de la pila

    // Metodos que acceden a la informacion (sin modificar)
    public T top(); // Devolver valor en la parte superior de la pila

    public int size(); // Devuelve el numero de elementos en la pila

    public boolean isEmpty(); // Indica si la pila esta vacia
}
