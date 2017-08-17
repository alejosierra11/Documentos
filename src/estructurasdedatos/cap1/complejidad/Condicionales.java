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
public class Condicionales {
    public Condicionales(){
    System.out.println("ejercicios de condicionales");
    }
    public void ejercicioscondicionales(){
        Scanner X = new Scanner(System.in);
    int j;
    System.out.println("ejercicios condicionales");
    System.out.println("1-numeros de n hasta m");
    System.out.println("2-numeros panes de n hasta m");
    System.out.println("3-numeros impares de n hasta m");
    
    j= X.nextInt();
    switch (j)  {  
        case 1:
            
        int num1, num2,x;
            System.out.println("numero de n hasta m");
            System.out.println("Introduzca primer número:");
            Scanner S=new Scanner(System.in);
            num1= S.nextInt();
            
            System.out.println("Introduzca segundo número:");
            Scanner A=new Scanner(System.in);
            num2= A.nextInt();
           
        	if (num1>num2)
            {
   	System.out.println("Los valores introducidos no son correctos \n");
    }
        	else
        	{
	    	for (x=num1;x<=num2;x++)
	    	{
       	System.out.println(x);
        }
	}
        break;
        
        case 2:
            int num100, num200,p;
     System.out.println("numeros pares de n hasta m");
     System.out.println("Introduzca primer número:");
     Scanner Z=new Scanner (System.in);
     num100= Z.nextInt();
      System.out.println("Introduzca segundo número:");
      Scanner D=new Scanner (System.in);
     num200= D.nextInt();
     
  	if (num100>num200)
      {
   	System.out.println("Los valores introducidos no son correctos \n");
    }
  	else
  	{
	  for (p=num100;p<=num200;p++)
	  {
        	if (p%2==0)
        	{
           	System.out.println(p);
        	}
    	}
	}
        break;
        
        case 3:
        int num300, num400,w;
            System.out.println("numeros impares de n hasta m");
            System.out.println("Introduzca primer número:");
            Scanner G=new Scanner (System.in);
            num300= G.nextInt();
            System.out.println("Introduzca segundo número:");
            Scanner H=new Scanner (System.in);
            num400= H.nextInt();
           
        	if (num300>num400)
            {
   	System.out.println("Los valores introducidos no son correctos \n");
    }
        	else
        	{
	    	for (w=num300;w<=num400;w++)
	    	{
        	if (w%2!=0)
        	{
           	System.out.println(w);
            }
    	}
	}
         break;
    }
 
}
}