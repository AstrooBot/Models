/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import java.util.List;

/**
 *
 * @author astrobot
 */
public class Strategy1 implements Strategy {

    @Override
    public String search(List<Car> listCar, String id) {
        int car_num = 0;
        for(int i = listCar.size(); i >= 0; i--) {
            
            if (listCar.get(i).id.equals(id)) {
               car_num = listCar.size() - i; 
            }
        }
    return car_num + "";
    }
    
}
