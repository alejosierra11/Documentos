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
public class Vector {
private int tamaño;
private String[]vector;

public void crearVector(int n){
this.tamaño=n;
this.vector=new String[this.tamaño];
}

public void settamaño(int t){
this.tamaño=t;
}
public int gettamaño(){
return tamaño;
}
public boolean eliminar(int x){
this.vector=null;
return true;
}
public void insertar(String n, int pos){
this.vector[pos]=n;
}

public String[] listas(){
for (int q=0;q<=tamaño; q++){
System.out.println(vector[q]);
}


public void ordenarVec(int vector[]){
for(int i = 0; i < vector.length - 1; i++)
        {
            for(int j = 0; j < vector.length - 1; j++)
            {
                if (vector[j] < vector[j + 1])
                {
                    int tmp = vector[j+1];
                    vector[j+1] = vector[j];
                    vector[j] = tmp;
                }
            }
        }
    
}

public void buscarBinario(int pos, int vector[]){
Integer posini=0;
Integer posfin=vector.length-1;
Integer poscentral = null;
while(posini<=posfin){
if (vector[poscentral]==pos){
System.out.println("el dato esta en:"+posini+"y"+posfin);
}
else {if(pos<=vector[poscentral]){
posfin=poscentral;
}
}
}
}
public void actualizar(int pos,String n){
if ((pos<tamaño)&&(pos>0)){
this.vector[pos]=n;
}
else{
System.out.println("tamaño del vector incorrecto");
}
}
public void borrar(int pos){
if ((pos<tamaño)&&(pos<0))
    this.vector[pos]=null;
}
else {
System.out.println("tamaño incorrecto");
}
}