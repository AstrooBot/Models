/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

public class Conversion {

    public char[] convertirMatriz(String data_string) {
       char[] resultado = new char[data_string.length()];
       for (int i = 0; i < data_string.length(); i++) {
       resultado[i] = data_string.charAt(i);
       }
       return resultado;
       }
    public int[] convertirSuma(char[] matriz_char) {
        int[] resultado = new int[matriz_char.length];
        for (int i = 0; i < matriz_char.length; i++) {
          
            if (matriz_char[i] == '+') {
              resultado[i] = 0;  
            }
            else {
             resultado[i] = (int) matriz_char[i];
            }
          
        }
        return resultado;
    }
       
    
}
