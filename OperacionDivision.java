/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author estudiantes
 */
public class OperacionDivision extends OperacionFabrica {

    @Override
    public Operacion generarOperacion() {
      return new Division();
    }

    }
  
