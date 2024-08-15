/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author AsBt.user
 */
public class Aritmetica {
    
    int resultado;
  
    public int sumar(int[] dato) {
       resultado = 0;
       for (int i = 0; i < dato.length; i++) {
            resultado += dato[i];
        }
    
        return resultado;
    }
    
    public int multiplicar(int[] dato) {
       resultado = 1; 
       for (int i = 0; i < dato.length; i++) {
            resultado *= dato[i];
        }
       return resultado;
    

    }
    
    
    
}
