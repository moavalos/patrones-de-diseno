package patrones.comportamiento;

import patrones.comportamiento.chainOfResponsibility.Tarjeta;
import patrones.comportamiento.command.CreditCardActivateCommand;
import patrones.comportamiento.command.CreditCardDesactivateCommand;
import patrones.comportamiento.command.CreditCardInvoker;
import patrones.comportamiento.command.TarjetaCredito;

public class Main {

    public static void main(String[] args) {
        probarChainOfResponsability();
        probarCommand();
    }

    private static void probarChainOfResponsability(){
        Tarjeta tarjeta = new Tarjeta();
        tarjeta.crediCardRequest(100000);
    }

    private static void probarCommand(){
        TarjetaCredito creditCard = new TarjetaCredito();
        TarjetaCredito creditCardDeactivate= new TarjetaCredito();

        CreditCardInvoker invoker = new CreditCardInvoker();

        invoker.setCommand(new CreditCardActivateCommand(creditCard));
        invoker.run();
        invoker.setCommand(new CreditCardDesactivateCommand(creditCardDeactivate));
        invoker.run();
    }
}
