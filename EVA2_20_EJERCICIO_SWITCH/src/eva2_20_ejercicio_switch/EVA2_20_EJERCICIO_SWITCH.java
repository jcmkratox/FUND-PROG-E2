/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_20_EJERCICIO_SWITCH {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int res ; 
     Scanner captu = new Scanner (System.in );
    System.out.println("DAME DOS VALORES ");
    int valor1 =captu.nextInt();
    int   valor2  =captu.nextInt();
    System.out.println("operacion que quieres ; 1 suma : 2 resta : 3  multi : 4 divicion ");
    int opera = captu.nextInt();
    switch (opera  ){// evalua entero : in t , short , byte ,  . texto ,
       case 1 :
          System.out.println("suma ");
          res = (valor1 + valor2);
          break ; 
       case 2 :
          System.out.println("resta");
          res = (valor1 - valor2);
          break ; 
       case 3 :
          System.out.println("multi");
          res = (valor1 * valor2);
          break ; 
       case 4 :
          System.out.println("divicion ");
          res = (valor1 / valor2);
          break ; 
 
    }
   }
   }
   

