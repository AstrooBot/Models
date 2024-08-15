/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author AsBt.user
 */
public class Calculadora {

    public static void main(String[] args) {
        /* String entrada;
        Salida objSalida = new Salida();
        Entrada objEntrada = new Entrada();
        Aritmetica objCalculadora = new Aritmetica();
        objSalida.enviar("ingrese su mensaje :");
        entrada = objEntrada.capturar();
*/

        
        String dato = "1+2+3+4+5+6";
        Conversion d = new Conversion();
        Aritmetica f = new Aritmetica();
        
        
        System.out.println(d.convertirMatriz(dato));
        
        char [] h = d.convertirMatriz(dato);
        int [] y = d.convertirSuma(h);
        int r = f.sumar(y);
        System.out.println(r);
        
        
        
        
        
        
    }
 
}
