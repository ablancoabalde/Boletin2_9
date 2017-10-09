
package boletin2_9;

import java.util.Scanner;

public class Boletin2_9 {

    public static void main(String[] args) {
    
        int dinero;
        Scanner entradateclado= new Scanner (System.in);
        
        System.out.println("Introduzca el dinero ingresado");
        
        dinero=entradateclado.nextInt();
        System.out.println("Usted ha ingresado " + dinero/100 + " billetes de 100 euros " + ((dinero%100)/20) + " billetes de 20 euros " + (((dinero%100)%20)/5) 
                + " billetes de 5 euros " + (((dinero%100)%20)%5/1) + " monedas");       
        
    }
    
}
