package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item7;

import java.util.EmptyStackException;

public class StackExample {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;

    public StackExample() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(Object element) {
        elements[size++] = element;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }
}
