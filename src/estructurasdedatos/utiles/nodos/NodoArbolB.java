/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author tusk
 */
public class NodoArbolB {

    private String dato;
    private Nodo izdo;
    private Nodo dcho;

    public NodoArbolB(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

    /**
     * @return the izdo
     */
    public Nodo getIzdo() {
        return izdo;
    }

    /**
     * @param izdo the izdo to set
     */
    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    /**
     * @return the dcho
     */
    public Nodo getDcho() {
        return dcho;
    }

    /**
     * @param dcho the dcho to set
     */
    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }

}

