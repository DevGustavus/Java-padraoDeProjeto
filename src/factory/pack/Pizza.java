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
public abstract class Pizza {
    
    protected List<Igredient> igredients;
    
    // Construtor modificado para protected para não ser instanciado
    protected Pizza(){
        
    }
    
    public List<Igredient> getIgredients() {
        return igredients;
    }

    @Override
    public String toString() {
        return "Pizza{" + "igredients=" + igredients + '}';
    }
    
}
