/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;

import strategy.pack.CreditCardPayment;
import strategy.pack.PayPalPayment;
import strategy.pack.PaymentStrategy;
import strategy.pack.ShoppingCart;
import strategy.pack.Ticket;

/**
 *
 * @author gusta
 */
public class strategyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ShoppingCart cart = new ShoppingCart();
        
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy paypalPayment = new PayPalPayment("gustavusinvictus@gmail.com");
        PaymentStrategy ticket = new Ticket("40028922");
        
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        cart.setPaymentStrategy(paypalPayment);
        cart.checkout(50);
        
        cart.setPaymentStrategy(ticket);
        cart.checkout(30);
    }
    
}
