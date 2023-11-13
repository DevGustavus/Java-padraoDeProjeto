/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.pack;

/**
 *
 * @author gusta
 */
public class Igredient {
    
    private String name;
    
    protected Igredient(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Igredient{" + "name=" + name + '}';
    }
    
}
