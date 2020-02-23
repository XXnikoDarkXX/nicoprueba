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
     /**
     *  Coge una submatriz a partir de la posición 0,0 de la
     * matriz original y la devuelve
     * Prerequisito: la matriz orig tiene que ser cuadrada o rectangular
     * 
     * @param filas cuántas filas queremos que se copien
     * @param columnas cuántas columnas queremos que se copien
     * @param orig matriz original a partir de la que se construye la submatriz
     * @param filaOrigen indicamos a partir de que fila queremos crear la subMatriz
     * @param columnaOrigen indicamos a partir de que columna queremos crear la subMatriz
     * @return matriz subconjunto de la original, de tamaño indicado por filas y columnas. Devuelve null si el tamaño pedido por filas o columnas es más grande que el tamaño de orig
     *///(2,4,matriz,0,5)
  /*  public static int[][] subMatriz(int filas,int columnas,int[][] orig, int filaOrigen, int columnaOrigen){
        if(filas+filaOrigen>orig.length||columnas+columnaOrigen>orig[0].length){
            return null;
        }
        int aux=columnaOrigen;
        int aux2=filaOrigen;
        int contaColumna=1;
        int contaFila=1;
        //Declaro matriz a devolver del tamaño introducido
        int[][] ret=new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            if (i>0) {
                filaOrigen++;
            }
            for (int j = 0; j < columnas; j++) {
                ret[i][j]=orig[filaOrigen][columnaOrigen];
               
                if (contaColumna<columnas) {
                    columnaOrigen++;
                   contaColumna++;
                }else{
                    contaColumna=0;
                    columnaOrigen=aux;
                }
                
                
                
            }
        }
        
        return ret;
    }
    
    
    public static String imprimeMatriz (int [][]orig){
        if (orig==null) {
            return null;
        }
        String res="";
        for (int i = 0; i <orig.length ; i++) {
            for (int j = 0; j < orig[i].length; j++) {
                 res+=orig[i][j]+"|";
            }
            res+="\n";
        }
        return res;*/
      /**
       * Funcion para imprimir una matriz centrada en forma piramide
       * @param orig la matriz a la cual vamos a centrar
       * @return String centrado
       */
      public static String  matrizCentrada  (String[][]orig){
      String aux=" ";
        String res="";
        for (int i = 0; i < orig.length; i++) {
            for (int j = 0; j < orig[i].length; j++) {
                
                switch(i){
                    case 0:
                    res+="          "+orig[i][j];
                        break;
                   case 1:
                        
                        if (j==0) {
                          res+="    "; 
                       }
                      res+=" "+orig[i][j];
                        break;
                   case 2:
                        res+=" "+orig[i][j];
                    break;
                   case 3:
                      res+=orig[i][j]+" "; 
                    break;
                }
            }
            res+="\n";
            }
        return res;
      }
    }

               
      

