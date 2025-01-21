/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

import java.util.Enumeration;

/**
 *
 * @author Estudiantes
 */
public class ConcretePark extends AbstractPark {
    //Implementar una busqueda de diccionario propio como empezar de arriba para abajo o que no busque desde la placa sino por otro atributo
    @Override
    protected Car searchCar(String id) {
        Car result = null;
        Enumeration<String> keys = dict.keys();
        while (keys.hasMoreElements()) {
            String k = keys.nextElement();
            if(k == id) {
                result = dict.get(k);
            }    
        }
        return result;
    }
    
}
