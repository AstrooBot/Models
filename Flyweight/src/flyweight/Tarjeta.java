/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight;

/**
 *
 * @author estudiantes
 */
public class Tarjeta implements ITarjeta {
    String codigo;
    
    @Override
    public String datos(String Usuario) {
       return Usuario + " " + this.codigo;
    }
}
