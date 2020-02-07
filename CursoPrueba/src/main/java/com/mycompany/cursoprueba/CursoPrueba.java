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
      
        
        
        String [][]saludos={{"muchos","ahora","vez"},{"la","y capaces","a"},{"de trabajar mucho","sois","alumnos"}};
       int [][]destino=new int[3][3];
       int contador=0;
       int contaFila=0;
       
       String []comprobacion=new String [12];
        
      String cadena= Arrays.deepToString(saludos);
            System.out.println("esta es la cadena"+cadena);
       cadena =cadena.replace("[", "").replace("]", "");
        System.out.println("esta es la cadena"+cadena);
        comprobacion=cadena.split(",");
           intercambiarValores(saludos,(byte)0,(byte)2,(byte)2,(byte)1); 
        for (int i = 0; i < comprobacion.length; i++) {
            System.out.print("| "+comprobacion[i]+" ");
        }
        

            for (int i=0; i < comprobacion.length-1; i++ ) {

for (int j=i+1; j<comprobacion.length; j++) {

if (comprobacion[i].length() > comprobacion[j].length()) {

String temp = comprobacion[i];

comprobacion[i] = comprobacion[j];

comprobacion[j] = temp;

}

}

}

            System.out.println("\n");
 for (int i=0; i < comprobacion.length; i++ ) {

     System.out.print(comprobacion[i]);

     

 }
 contador=0;//TO DO REVISAr pues tengo que definir dos contadores seguramente o algo
        for (int i = 0; i < saludos.length-1; i++) {
            for (int j = 0; j < saludos[i].length; j++) {
                
               saludos[i][j]= comprobacion[contador];
                contador++;
                    
                }
            }
        
        
        
        
        System.out.println("Tu matriz es: \n"+imprimeMatriz(saludos));
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
