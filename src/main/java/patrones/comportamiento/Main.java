package patrones.comportamiento;

import patrones.comportamiento.chainOfResponsibility.Tarjeta;
import patrones.comportamiento.command.CreditCardActivateCommand;
import patrones.comportamiento.command.CreditCardDesactivateCommand;
import patrones.comportamiento.command.CreditCardInvoker;
import patrones.comportamiento.command.TarjetaCredito;
import patrones.comportamiento.iterator.CardList;
import patrones.comportamiento.iterator.Iterator;
import patrones.comportamiento.iterator.List;
import patrones.comportamiento.mediator.ConcreteColleage1;
import patrones.comportamiento.mediator.ConcreteColleage2;
import patrones.comportamiento.mediator.ConcreteMediator;

public class Main {

    public static void main(String[] args) {
        probarChainOfResponsability();
        probarCommand();
        probarIterator();
        probarMediator();
    }

    private static void probarMediator(){
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleage1 user1 = new ConcreteColleage1(mediator);
        ConcreteColleage2 user2 = new ConcreteColleage2(mediator);

        mediator.setUser1(user1);
        mediator.setUser2(user2);

        user1.send("Hola soy user1");
        user2.send("Hola user1, soy user2");
    }

    private static void probarIterator(){
        patrones.comportamiento.iterator.Tarjeta[] cards = new patrones.comportamiento.iterator.Tarjeta[5];
        cards[0] = new patrones.comportamiento.iterator.Tarjeta("VISA");
        cards[1] = new patrones.comportamiento.iterator.Tarjeta("AMEX");
        cards[2] = new patrones.comportamiento.iterator.Tarjeta("MASTER CARD");
        cards[3] = new patrones.comportamiento.iterator.Tarjeta("GOOGLE CARD");
        cards[4] = new patrones.comportamiento.iterator.Tarjeta("APPLE CARD");

        List lista = new CardList(cards);
        Iterator iterator = lista.iterator();

        while (iterator.hasNext()){
            patrones.comportamiento.iterator.Tarjeta tarjeta = (patrones.comportamiento.iterator.Tarjeta)iterator.next();
            System.out.println(tarjeta.getType());
        }

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
