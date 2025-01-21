
package templatemethod;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class AbstractPark {
    
    Dictionary<String, Car> dict = new Hashtable<>();
    
    final public String saveCar(String id, Car car) {
        this.assignCar(id, car);
        return this.searchCar(id);
    }
    
    protected void assignCar(String id, Car car) {
        dict.put(id, car);
    }
    protected abstract String searchCar(String id);
    
}
