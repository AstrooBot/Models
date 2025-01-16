/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight;

import java.util.*;

public class FabricaTarjeta {
    
    List<ITarjeta> Tarjetas = new ArrayList<>();
    
    public ITarjeta get_tarjeta(String Usuario) {
        for (ITarjeta value : Tarjetas) {
            if(value.usuario.equals(Usuario)) {
               return value; 
            }
            else {
                ITarjeta tarjeta = new Tarjeta();
                
            }
            }    
    }
}
