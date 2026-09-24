/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //AMTIDAMIENTO 
         int edad, credencial  ;
         Scanner captu = new Scanner (System.in );
         System.out.println("cual es tu edad ");
         edad =captu.nextInt();
         if (edad >=18){
             System.out.println("tienes credenciañ de elector ? ( 1 = si, 0 = no ) : ");
             credencial = captu.nextInt();
             if (credencial == 1 ){
                 System.out.println("puedes entra ");
                 
             }else {
                 System.out.println("no puedes entar ");
             }
         }else{
             System.out.println("kick in the bcak");
         }
                 
    }
    
}
