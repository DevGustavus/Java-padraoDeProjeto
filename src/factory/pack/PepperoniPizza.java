/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.pack;

import java.util.List;

/**
 *
 * @author gusta
 */
public class PepperoniPizza extends Pizza{
    
    protected PepperoniPizza(){
        this.igredients = List.of(
            new Igredient("Tomate"),
            new Igredient("Cheese"),
            new Igredient("Sault"),
            new Igredient("Oregano"),
            new Igredient("Pepperoni"),
            new Igredient("Onion"),
            new Igredient("Olive")
        );
    }
}
