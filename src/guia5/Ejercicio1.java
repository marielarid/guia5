/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.io.InputStream;



/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int enteros [] = new int [100];
        for (int i = 0; i < 100; i++) {
          enteros [i]= i +1; 
            
        }
        for (int i =99; i > 0; i--) {
            System.out.print("[ "+ enteros[i] + " ]"); 
        }
    }

    private static class Scanner {

        public Scanner(InputStream in) {
        }
    }
    
}
