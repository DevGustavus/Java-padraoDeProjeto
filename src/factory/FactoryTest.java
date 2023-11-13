/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;

import factory.pack.Pizza;
import factory.pack.pizzaFactory;

/**
 *
 * @author gusta
 */
public class FactoryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pizza pizzaDoce = pizzaFactory.getInstance(true);
        Pizza pizzaSalgada = pizzaFactory.getInstance(false);
        
        System.out.println("Sweet pizza:");
        System.out.println(pizzaDoce.toString());
        System.out.println("\nPizza:");
        System.out.println(pizzaSalgada.toString());
    }
    
}
