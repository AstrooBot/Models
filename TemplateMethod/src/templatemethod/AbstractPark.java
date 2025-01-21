
package templatemethod;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class AbstractPark {
    
    Dictionary<String, Car> dict = new Hashtable<>();
    
    final public void saveCar(String id, Car car) {
        this.assignCar(id, car);
        this.searchCar(id);
    }
    
    protected void assignCar(String id, Car car) {
        dict.put(id, car);
    }
    protected abstract Car searchCar(String id);
    
}
