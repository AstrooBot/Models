/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import java.util.Dictionary;
import java.util.Hashtable;


public abstract class Context {
    
    // Da acceso a las distintas estrategias. las distintas estrategias deben ser distintas formas de crear placas
    
    Dictionary<String, Car> dict = new Hashtable<>();
    Context strategy = null;
   
    public abstract void getCar(String id);
    
    public void setStrategy(Context strategy) {
        this.strategy = strategy;
    }
    
    
    
}
