/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatemethod;

/**
 *
 * @author Estudiantes
 */
public class TemplateMethod {

    public static void main(String[] args) {
        AbstractPark park = new ConcretePark();
        Salida out = new SalidaTeclado();
        Car car1 = new Car("ABC-001");
        Car car2 = new Car("ABC-002");
        Car car3 = new Car("ABC-003");
        
        out.enviar(park.saveCar(car1.id, car1));
        out.enviar(park.saveCar(car1.id, car2));
        out.enviar(park.saveCar(car1.id, car3));
    }
    
}
