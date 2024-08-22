/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;


public class Calculadora {

    public static void main(String[] args) {
        String entrada;
        EntradaSalidaTecladoFactory fabrica = new EntradaSalidaTecladoFactory(); 
        Entrada objEntrada = fabrica.generarEntrada();
        Salida objSalida = fabrica.generarSalida();
        Cliente objCliente = new Cliente(objEntrada, objSalida);
        Conversion objConversion = new ConversionEnteros();
        Aritmetica objCalculadora = new AritmeticaEnteros();
        objCliente.salida.enviar("ingrese su mensaje :");
        entrada = objCliente.entrada.capturar();
        objCliente.salida.enviar(objCalculadora.sumar(objConversion.convertirMatriz(entrada))+ "");
        
        
    }
 
}
