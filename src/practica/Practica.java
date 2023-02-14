/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;


public class Practica {
    
    public static void main(String[] args) {
   
        int matriz [][] = new int [4][4];
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
             if (f!=c){
                 matriz[f][c]= 1;
             }
             else{
                 matriz[f][c] = 0;
            }
            
        }
        }
    }
}
