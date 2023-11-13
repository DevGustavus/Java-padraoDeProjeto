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
public class chocolatePizza extends Pizza{

    protected chocolatePizza(){
        this.igredients = List.of(
            new Igredient("Dark chocolate"),
            new Igredient("White chocolate"),
            new Igredient("Strawberry"),
            new Igredient("M&Ms")
        );
    }
    
    
}
