/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.pack;

/**
 *
 * @author gusta
 */
public class Ticket implements PaymentStrategy{

    private String ticketCode;

    public Ticket(String ticketCode) {
        this.ticketCode = ticketCode;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using a ticket " + ticketCode);
    }
    
}
