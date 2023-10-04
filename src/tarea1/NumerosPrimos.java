
package tarea1;
import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner Pri = new Scanner(System.in);
        
        int num=0;
        System.out.println("Ingrese un numero");
        num= Pri.nextInt();
        
        if(num>0){
            if(num>0 && num<100){
                
            }
            if(num%2==0){
                System.out.println("Numero no pirmo");
                
            }else
                System.out.println("Numero primo");
           
    }
    
}
}