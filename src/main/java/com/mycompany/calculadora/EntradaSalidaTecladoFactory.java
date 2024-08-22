/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author AsBt.user
 */
public class EntradaSalidaTecladoFactory extends EntradaSalidaFactory {

    @Override
    public Salida generarSalida() {
        
       Salida out = new SalidaTeclado();
       return out;
    }

    @Override
    public Entrada generarEntrada() {
      Entrada in = new EntradaTeclado();
      return in;
    }
    
}
