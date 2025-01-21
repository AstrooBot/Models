/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

import java.util.List;

/**
 *
 * @author Estudiantes
 */
public class ConcretePark extends AbstractPark {
    
    @Override
    protected String searchCar(String id) {
        List<String> keys = (List<String>) dict.keys();
        int result = keys.indexOf(id); 
        return result + "";
    }

    }
    
