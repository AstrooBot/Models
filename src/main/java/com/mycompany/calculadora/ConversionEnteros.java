/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

public class ConversionEnteros extends Conversion {

    public int[] convertirMatriz(String data_string) {
       char[] resultado = new char[data_string.length()];
       for (int i = 0; i < data_string.length(); i++) {
       resultado[i] = data_string.charAt(i);
       }
       int[] matrizFinal = new int[resultado.length];
        for (int i = 0; i < resultado.length; i++) {  
            if (resultado[i] == '+') {
              matrizFinal[i] = 0; 
            }
            else if (resultado[i] == '*') {
            matrizFinal[i]= 1;
        }
            else {
             matrizFinal[i] = resultado[i] - '0';
            }
        }
        return matrizFinal;


       }
       
    
}
