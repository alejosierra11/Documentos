/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

/**
 *
 * @author tusk
 */
public class ArbolBinario {

    public int dato;
    public NodoArbolBinario raiz;

    public void insertarNodo(int dato) {

        NodoArbolBinario nuevoNodo = new NodoArbolBinario();
        NodoArbolBinario cont;
        nuevoNodo.setDato(dato);
        cont = raiz;
        int a = 0;

        if (raiz == null) {
            raiz = nuevoNodo;
           
        } else {
            while (a == 0) {
                if (nuevoNodo.getDato() > cont.getDato()) {
                    if (cont.getNodoDerecho() == null) {
                        cont.setNodoDerecho(nuevoNodo);
                      a++;
                    } else {
                        cont = cont.getNodoDerecho();
                    }
                } else if (cont.getNodoIzquierdo() == null) {
                    cont.setNodoIzquierdo(nuevoNodo);
                    a++;
                } else {
                    cont = cont.getNodoIzquierdo();
                }
            }
        }
    }

    public void buscarDato(NodoArbolBinario raiz, int dato) {
        NodoArbolBinario datico = new NodoArbolBinario();
        NodoArbolBinario cont;
        datico.setDato(dato);
        cont = raiz;
        int a = 0;

        if (datico.getDato() == cont.getDato()) {
                   } else {
            while (a == 0) {
                if (datico.getDato() > cont.getDato()) {
                    if (cont.getNodoDerecho() == null) {
                        a++;
                    } else if (cont.getNodoDerecho().getDato() == datico.getDato()) {
                        
                        a++;
                    } else {
                        cont = cont.getNodoDerecho();
                    }
                } else if (cont.getNodoIzquierdo() == null) {
                    System.out.println("No se encontró el número " + dato);
                    a++;
                } else if (cont.getNodoIzquierdo().getDato() == datico.getDato()) {
                   a++;
                } else {
                    cont = cont.getNodoIzquierdo();
                }
            }
        }
    }

    public void preOrder(NodoArbolBinario raiz) {
        if (raiz != null) {
          }
    }

    public void inOrder(NodoArbolBinario raiz) {
        if (raiz != null) {
            preOrder(raiz.getNodoIzquierdo());
             }
    }

    public void postOrder(NodoArbolBinario raiz) {
        if (raiz != null) {
            preOrder(raiz.getNodoIzquierdo());
            preOrder(raiz.getNodoDerecho());
            }
    }
}
