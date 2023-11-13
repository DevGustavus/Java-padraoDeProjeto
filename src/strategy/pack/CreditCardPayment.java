/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.pack;

/**
 *
 * @author gusta
 */
public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;
    
    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card " + cardNumber);
    }
    
}
