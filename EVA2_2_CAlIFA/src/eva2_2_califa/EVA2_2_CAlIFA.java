/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_califa;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_2_CAlIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int cali ;
              Scanner imput = new Scanner (System.in);
              System.out.println("cual es tu califa");
              cali  = imput.nextInt();
              if(cali  >= 70) 
                  System.out.println("Felicizades aprovaste ");
              else 
                  System.out.println("por pendejo reprobaste  ");
              
    }
    
}
