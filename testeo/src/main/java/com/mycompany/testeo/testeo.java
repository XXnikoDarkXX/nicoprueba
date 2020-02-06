/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class testeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       /* byte numero;
        byte j = 0;
        int[] numeroArray;
        byte minimo = 0;
        byte maximo = 10;
        int masGrande = 0;
        int mayorQue = -1;
        int actual = 0;
        int vecesRepetidoActual=0;
        Random aleatorio = new Random();
        System.out.println("Dime un numero");
        numero = Byte.parseByte(sc.nextLine());
        int[] destino = new int[numero];
        numeroArray = new int[numero];

        for (int i = 0; i < numeroArray.length; i++) {
            int numeroAleatorio = aleatorio.nextInt((maximo - minimo) + 1) + minimo;
            numeroArray[i] = numeroAleatorio;
        }
        System.out.println(imprimeArray(numeroArray));
        //busca el mas grande
        for (int k = 0; k < numeroArray.length; k++) {
            if (numeroArray[k] > masGrande) {
                masGrande = numeroArray[k];
            }
        }
        actual=masGrande;

     
        for (int i = 0; i < numeroArray.length; i++) {
            for (int k = 0; k < numeroArray.length; k++) {
                if (numeroArray[k] < actual && numeroArray[k] > mayorQue) {
                    actual = numeroArray[k];
                    vecesRepetidoActual=0;
                    for (int l = 0; l<numeroArray.length; l++) {
                        if(numeroArray[l]==actual){
                            vecesRepetidoActual++;
                        }
                    }
                }

            }
            for (int k = 0; k < vecesRepetidoActual&&(i+k)<destino.length; k++) {
                destino[i+k] = actual;
            }
            i=i+vecesRepetidoActual-1;
            mayorQue = actual;
            actual = masGrande;

        }
       //Terminado hacer otro hardcodeado con un switch
        System.out.println(imprimeArray(destino));*/
        
        System.out.println("Parte del ejercicio 14");

       
        char []desplazado=new char[10];
        char aux0=' ';
        char aux1=' ';
        char aux2=' ';
        char aux3=' ';
        char aux4=' ';
        char aux5=' ';
        char aux6=' ';
        char aux7=' ';
        char aux8=' ';
        char aux9=' ';
      // byte contador=8;
       byte original=9;
       byte contaTexto=0;
                String texto = "Mira como mola esto, una marquesina";
          for (int i = 0; i < desplazado.length-1; i++) {
           
              for (int j = 0; j < desplazado.length-1; j++) {
    
               desplazado[9]=texto.charAt(contaTexto);
               
             
                  if (original>0) {
                    original--;  
                  }
                   
             System.out.println(desplazado);   
                       aux9=desplazado[9];
                       aux8=desplazado[8]; 
                       aux7=desplazado[7];
                       aux6=desplazado[6];
                       aux5=desplazado[5]; 
                       aux4=desplazado[4];
                       aux3=desplazado[3];
                       aux2=desplazado[2];
                       aux1=desplazado[1];
                       aux0=desplazado[0];
                       
                   for (int k = 0; k < 1; k++) {
                 desplazado[9]=aux0;
                 desplazado[8]=aux9;            
                 desplazado[7]=aux8;
                desplazado[6]=aux7;
                desplazado[5]=aux6;
                  desplazado[4]=aux5;
                    desplazado[3]=aux4;
                    desplazado[2]=aux3;
                    desplazado[1]=aux2;
                    desplazado[0]=aux1;
                  }
                    
                   if (contaTexto<34) {
                      contaTexto++;
                  }else{
                       i=desplazado.length-1;
                   }
                   
           
              }
       original=9;
     }
    }

    /* int aleatorio1, aleatorio2, aleatorio3, aleatorio4, aleatorio5, contador = 0;
        int numero1,numero2,numero3,numero4,numero5;
        int[] bingo = new int[5];

        //El aleatorio sale con decimales habra que multiplicarlo *100
        aleatorio1 = (int) (Math.random() * 100);//Genera un numero aleatorio entre 0-100
        aleatorio2 = (int) (Math.random() * 100);
        aleatorio3 = (int) (Math.random() * 100);
        aleatorio4 = (int) (Math.random() * 100);
        aleatorio5 = (int) (Math.random() * 100);
        bingo[0] = aleatorio1;
        bingo[1] = aleatorio2;
        bingo[2] = aleatorio3;
        bingo[3] = aleatorio4;
        bingo[4] = aleatorio5;
        for (int i = 0; i < bingo.length; i++) {
                System.out.println(bingo[i]);
            }
        
        do {
            System.out.println("Escribe el primer numero haber si aciertas");
          numero1=Integer.parseInt(sc.nextLine());
           if (aleatorio1>numero1) {
              System.out.println("Digite un numero mayor que "+ numero1);
          }else{
              System.out.println("Digite un numero menor");
          }
            System.out.println("Digite segundo numero haber si aciertas");
                     numero2=Integer.parseInt(sc.nextLine());
            if (aleatorio2>numero2) {
                System.out.println("Digite un numero mayor");
            }else{
                System.out.println("Digite un numero menor");
            }
 
           
          contador++;
        } while (numero1!=aleatorio1||numero2!=aleatorio2);
        System.out.println("Bingo adivinastes todos los numeros en "+contador+" intentos");
        /*    do{
          System.out.println("Escribe un numero");
          numero=Integer.parseInt(sc.nextLine());
          if (aleatorio>numero) {
              System.out.println("Digite un numero mayor");
          }else{
              System.out.println("Digite un numero menor");
          }
          contador++;
      }while(numero!=aleatorio);
        System.out.println("Genial!!\n Adivinaste el número en: "+contador +"intentos");*/
    public static String imprimeArray(int[] orig) {
        String res = "";
        for (int i = 0; i < orig.length - 1; i++) {
            res += orig[i] + " | ";
        }
        return res + orig[orig.length - 1];
    }

}
