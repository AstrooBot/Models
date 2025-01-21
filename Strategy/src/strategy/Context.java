/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;



import java.util.List;

public class Context {
    Salida out = new SalidaTeclado();
    Strategy strategy = null;
   
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void execute(List<Car> listCar,  String id) {
        out.enviar(this.strategy.search(listCar, id));
        
    }
    
}
