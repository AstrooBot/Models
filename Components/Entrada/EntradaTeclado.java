/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author estudiantes
 */
import java.util.Scanner;

public class EntradaTeclado extends Entrada {
 String input;
 @Override
 public String capturar() {
    Scanner input_capture = new Scanner(System.in);
    this.input =  input_capture.nextLine();
    return input;
 }
    
}
