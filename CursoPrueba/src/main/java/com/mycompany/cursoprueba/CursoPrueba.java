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
      
      String[][]descifrar={{"yo quiero","descifrar","password!"},{"tengo","mucho","sueño"}};
      //Creamos la matriz comprobacion
      //Creamos la matriz ultimas letras
       String [][]comprobacion=new String[2][3];
              String[][]ultimasLetras=new String [2][3];
        String aux;         //auxiliar de letra
        String aux2;  //auxiliar de las tres ultimas letras
        int contadorFinal=0;//contador de 0
        
        //añadimos las tres ultiams letras a una matriz y el texto sin las tres ultimas letras a otra
        for (int i = 0; i < descifrar.length; i++) {
            for (int j = 0; j < descifrar[i].length; j++) {
                ultimasLetras[i][j]=descifrar[i][j].substring(descifrar[i][j].length()-3, descifrar[i][j].length());
                comprobacion[i][j]=descifrar[i][j].substring(0, descifrar[i][j].length()-3);
                
            }
            }
     //Creamos el algoritmo para cifrar las letras
        
        for (int i = 0; i < descifrar.length; i++) {
            for (int j = 0; j < descifrar[i].length; j++) {
                if (i==1) {
                     if (j==descifrar[i].length-1&&i==1) {
                    comprobacion[i][j]+=ultimasLetras[i][0];
                        
                }else{
                    comprobacion[i][j]+=ultimasLetras[i][j+1];
                } 
                }
         
                if (i==0) {
                  if (j==descifrar[i].length-1&&i==0) {
                    comprobacion[i][0]+=ultimasLetras[i][j];
                }else{
                    comprobacion[i][j+1]+=ultimasLetras[i][j];
                }  
                }
                
            }
        }
        
        System.out.println("Tu matriz es: \n"+imprimeMatriz(comprobacion));
    
   /* public static String [] ordenarMatriz(String [] orig){
        String [][]destino=new String[3][3];
           String cadena;
           //Convertimos a String la matriz
        
               cadena= Arrays.deepToString(orig);
            System.out.println(cadena);
        
       
           return null;
           }
    */
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
      public static void intercambiarValores(String[][]orig,byte f1, byte f2, byte c1, byte c2){
          String aux=orig[f1][c1];
          orig[f1][c1]=orig[f2][c2];
          orig[f2][c2]=aux;
      }
     
               
      
}
