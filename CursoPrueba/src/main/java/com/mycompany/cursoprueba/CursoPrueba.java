/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cursoprueba;

import java.util.Arrays;

/**
 *
 * @author nicoc
 */
public class CursoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        String[][]matriz={{"yo quird!","descifero","passworar"},{"techo","mueño","sungo"}};
        int f0,c0,f1,c1;
       String aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length-1; j++) {
                
            }
        }
        
        System.out.println("Tu matriz es: \n"+imprimeMatriz(matriz));
    }
   /* public static String [] ordenarMatriz(String [] orig){
        String [][]destino=new String[3][3];
           String cadena;
           //Convertimos a String la matriz
        
               cadena= Arrays.deepToString(orig);
            System.out.println(cadena);
        
       
           return null;
           }
    */
      public static String imprimeMatriz (String [][]orig){
        String res="";
        for (int i = 0; i <orig.length ; i++) {
            for (int j = 0; j < orig[i].length; j++) {
                 res+=orig[i][j]+"|";
            }
            res+="\n";
        }
        return res;
    }
      public static void intercambiarValores(String[][]orig,byte f1, byte f2, byte c1, byte c2){
          String aux=orig[f1][c1];
          orig[f1][c1]=orig[f2][c2];
          orig[f2][c2]=aux;
      }
     
               
      
}
