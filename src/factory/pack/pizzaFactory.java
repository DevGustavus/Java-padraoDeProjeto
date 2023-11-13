/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.pack;

/**
 *
 * @author gusta
 */
public class pizzaFactory {

    private pizzaFactory() {
        
    }
    
    public static Pizza getInstance(boolean sweet){
        return sweet ? new chocolatePizza() : new PepperoniPizza();
    }
    
    
    
}
