
package tarea1;

import java.util.Scanner;

public class suma {

    
    public static void main(String[] args) {
       int num1,num2,num3,resultado;
       
       Scanner sum=new Scanner(System.in);
       
       System.out.println("Ingrese el primer numero");
       num1=sum.nextInt();
       System.out.println("Ingrese el segundo numero");
       num2=sum.nextInt();
       System.out.println("Ingrese el primer numero");
       num3=sum.nextInt();
    
        resultado=num1+num2+num3;
        
        System.out.println("La suma de los numeros es: " +resultado);
    }
    
    
}
