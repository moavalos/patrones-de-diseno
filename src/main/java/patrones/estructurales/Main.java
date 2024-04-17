package patrones.estructurales;

import patrones.estructurales.adapter.CreditCard;
import patrones.estructurales.bridge.ClassicCreditCard;
import patrones.estructurales.bridge.CreditCardBridge;
import patrones.estructurales.bridge.SecureCreditCard;
import patrones.estructurales.bridge.UnsecureCreditCard;
import patrones.estructurales.composite.CuentaAhorro;
import patrones.estructurales.composite.CuentaComponent;
import patrones.estructurales.composite.CuentaComposite;
import patrones.estructurales.composite.CuentaCorriente;

public class Main {

    public static void main(String[] args) {
        probarAdapter();
        probarBridge();
        probarComposite();
    }

    private static void probarComposite(){
        CuentaComponent cuentaCorriente = new CuentaCorriente(1000.0, "Alberto");
        CuentaComponent cuentaAhorro = new CuentaAhorro(20000.0, "Alberto");

        CuentaComposite cuentaComposite = new CuentaComposite();
        cuentaComposite.addCuenta(cuentaCorriente);
        cuentaComposite.addCuenta(cuentaAhorro);

        cuentaComposite.showAccountName();
        cuentaComposite.getAmount();
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