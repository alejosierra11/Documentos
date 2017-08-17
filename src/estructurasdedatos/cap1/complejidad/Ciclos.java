/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;
import java.util.Scanner;
/**
 *
 * @author tusk
 */
public class Ciclos {
    public Ciclos(){
        System.out.println("ejecicios ciclos");
    }  
    public void ejerciciosciclos(){
        Scanner L = new Scanner(System.in);
    int k;
    System.out.println("ejercicios de ciclos");
    System.out.println("1-numeros de 1 a 100");
    System.out.println("2-numeros de 100 a 1");
    System.out.println("3-numeros pares de 1 a 100");
    System.out.println("4-numeros imapares de 1 a 100");
     k= L.nextInt();
        switch(k){   
            
            case 1:{
                int m;
            for (m=1;m<=100;m++)
        	{
    	System.out.println(m);
	}
            break;
            }
            case 2:
            {
    int y;
           
        	for (y=100;y>=1;y--)
        	{
    	System.out.println(y);
	}
                break;
    }
            case 3:
            {
    int j;
           
        	for (j=1;j<=100;j++)
        	{
    	if (j%2==0)
    	{
       	System.out.println(j);
    	}
        break;
    }
   }
            case 4:
            {
    int a;
           
        	for (a=1;a<=100;a++)
        	{
    	if (a%2!=0)
    	{
       	System.out.println(a);
    	}
        break;
    }
    }             
}
    }}