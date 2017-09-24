/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import java.util.Stack;

public class Pila {

    String arr[];
    int max;
    int top;

    public Pila() {

        arr = new String[10];
        top = 0;
    }

    public boolean empity() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(String str) {
        //insertar datos a la pila
        if (top < arr.length) {

            arr[top] = str;
            top++;
        } else {
            String tempo[] = new String[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                tempo[i] = arr[i];
            }
            arr = tempo;
            arr[top] = str;
            top++;
        }
    }

    public String peek() {
        if (top > 0) {
            return arr[top - 1];
        } else {
            return null;
        }
    }

    public String pop() {
        String temp;
        if (top > 0) {
            temp = arr[top - 1];
            arr[top - 1] = null;
            top--;
        }
        return temp;
    }

}
