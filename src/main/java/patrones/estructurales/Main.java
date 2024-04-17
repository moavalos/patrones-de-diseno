package patrones.estructurales;

import patrones.estructurales.adapter.CreditCard;
import patrones.estructurales.bridge.ClassicCreditCard;
import patrones.estructurales.bridge.CreditCardBridge;
import patrones.estructurales.bridge.SecureCreditCard;
import patrones.estructurales.bridge.UnsecureCreditCard;

public class Main {

    public static void main(String[] args) {
        probarAdapter();
        probarBridge();
    }

    private static void probarBridge(){
        CreditCardBridge classic = new ClassicCreditCard(new UnsecureCreditCard());
        classic.realizarPago();

        classic = new ClassicCreditCard(new SecureCreditCard());
        classic.realizarPago();
    }

    private static void probarAdapter(){
        CreditCard creditCard = new CreditCard();
        creditCard.pay("classic");
        creditCard.pay("gold");
        creditCard.pay("black");
        creditCard.pay("silver");
    }
}