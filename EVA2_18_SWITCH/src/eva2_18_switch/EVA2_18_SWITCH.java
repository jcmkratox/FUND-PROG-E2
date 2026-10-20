/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_18_SWITCH {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
    Scanner captu = new Scanner (System.in );
    System.out.println("introduce el numero del dia ( 1 -7) : ");
    int dia =captu.nextInt();
    
    switch (dia ){// evalua entero : in t , short , byte ,  . texto ,
       case 1 :
          System.out.println("domingo");
          break ; 
       case 2 :
          System.out.println("lunes ");
          break ; 
       case 3 :
          System.out.println("martes");
          break ; 
       case 4 :
          System.out.println("miercoles ");
          break ; 
       case 5 :
          System.out.println("jueves ");
          break ; 
       case 6 :
          System.out.println("viernes ");
          break ; 
       case 7 :
          System.out.println("sabado ");
          break ; 
       default: // opcionalñ :
          System.out.println("dia invalido ");
    }
   }
   
}
