/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cursoprueba;

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
      
        
        
        String [][]saludos={{"muchos","ahora","vez"},{"la","y capaces","a"},{"de trabajar mucho","sois","alumnos"}};
       
        
        
        System.out.println("Tu matriz es: \n"+imprimeMatriz(saludos));
    }
    public static String [] ordenarMatriz(String [] orig){
        String [][]destino=new String[3][3];
           
           for (int i = 0; i < orig.length; i++) {
               for (int j = 0; j < orig[i].length(); j++) {
                
               }
        }
    }
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
}
