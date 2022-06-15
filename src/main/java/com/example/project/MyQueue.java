package com.example.project;

public interface MyQueue<T extends Comparable<T>> {

    // Metodos que modifican la cola
    public void enqueue(T v); // Poner un valor al final de la cola

    public T dequeue(); // Elimina y devuelve el valor al principio de la cola

    // Metodos que acceden a la informacion (sin modificar)
    public T first(); // Valor devuelto al principio de la cola

    public int size(); // Devuelve el numero de elementos en la cola

    public boolean isEmpty(); // Indica si la cola esta vacia
}
