/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;

import java.util.*;


public class Test {

    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        Strategy strategy1 = new Strategy1();
        Strategy strategy2 = new Strategy2();
        Context context = new Context();
        int n = 5;
        for (int i = 0; i <= n; i++) {
            list.add(new Car("ABC-00" + Integer.toString(i)));
        }
        context.setStrategy(strategy1);
        context.execute(list, "ABC-002");
        context.setStrategy(strategy2);
        context.execute(list, "ABC-002");
    }
    
}
