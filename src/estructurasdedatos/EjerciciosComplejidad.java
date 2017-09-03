/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;
public class EjerciciosComplejidad {
public void ejerciciosOn(){
Scanner a=new Scanner(System.in);
int j=0;
System.out.println("ejercicios On");
System.out.println("1-ejercicio O(1)");
System.out.println("2-ejercicio O(n)");
System.out.println("3-ejercicio O(n^2)");
System.out.println("4-ejercicio O(n log(n))");

j=a.nextInt();

switch (j){
    case 1:
        System.out.println("ingrese dato para determinar si es par");//--------------O1
        Scanner b=new Scanner(System.in);//--------------O1
        int z= b.nextInt();//--------------O1
        if (z%2==0){//--------------On
        System.out.println("el numero es par");//--------------O1
        } else {//--------------On
            System.out.println("el numero es impar");//--------------O1
        }
        break;
    case 2:
        System.out.println("ingrese un dato para determinar si es primo");//--------------O1
        Scanner c= new Scanner(System.in);//--------------O1
        int n1=c.nextInt();//--------------O1
        int n2=n1-1; //--------------O1
        while ((n1%n2)!=0){//--------------On
        n2--;//--------------O1
        } if (n2==1){//--------------On
        System.out.println("el numero es primo");//--------------O1
        }else{//--------------On
        System.out.println("El numero no es primo");//--------------O1
        }
        break;
    case 3:
        System.out.println("ingrese el numero de la tabla de multiplicar");//--------------O1
        Scanner d=new Scanner(System.in);//--------------O1
        int h=d.nextInt();//--------------O1
        int multi;//--------------O1
        for (int g=1;g<=h;g++){//--------------On
        for (int i=1;i<=10;i++){//--------------On
           multi=g*i; //--------------O1
           System.out.println(g+"x"+i+"="+multi);//--------------O1
           
        }
                } 
        break;
    
        }
        
        }
        
    
        
        
}
    
   

