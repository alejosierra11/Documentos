/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;

/**
 *
 * @author tusk
 */
public class Matriz {
    private int fila;
    private int columna;
    int matriz[][]=new int [fila][columna];
    
    public void nMatriz(int nfila, int ncolumna){
    this.fila=nfila;
    this.columna=ncolumna;
    this.matriz=new int [nfila][ncolumna];
    }
    
    public void insertar (int nfila,int ncolumna, int dato){
        this.fila=nfila;
        this.columna=ncolumna;
        this.matriz[nfila][ncolumna]=dato;
    }
    public void eliminar(int nfila,int ncolumna){
        this.fila=nfila;
        this.columna=ncolumna;
        this.matriz[nfila][ncolumna]=0;
    }
    
    public void buscar(int dato){
    for (int nfila=0; nfila<matriz.length; nfila++){
        for(int ncolumna=0; ncolumna<matriz.length; ncolumna++){
    if (this.matriz[nfila][ncolumna]==dato){
        System.out.println("El dato esta en la posicion:"+nfila+ncolumna);
            }
          }
        }
    }
    
    public void listar(){
    for (int x=0;x<matriz.length; x++){
    for (int y=0; y<matriz[x].length; y++){
    System.out.println(matriz[x][y]);
    System.out.println(" ");
    }
    }
    }
}
