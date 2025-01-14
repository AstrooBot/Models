/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author estudiantes
 */
public class SalidaTeclado extends Salida{
    String mensaje;
    @Override
    public void enviar(String data) {
        mensaje = data;
        System.out.println("Resultado : " + mensaje);
    }
    
}
