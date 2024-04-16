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
import patrones.comportamiento.memento.Article;
import patrones.comportamiento.memento.ArticleMemento;
import patrones.comportamiento.memento.Carataker;
import patrones.comportamiento.observer.Coche;
import patrones.comportamiento.observer.MessagePublisher;
import patrones.comportamiento.observer.Peaton;
import patrones.comportamiento.observer.Semaforo;

public class Main {

    public static void main(String[] args) {
        probarChainOfResponsability();
        probarCommand();
        probarIterator();
        probarMediator();
        probarMemento();
        probarObserver();
    }

    private static void probarObserver(){
        Coche coche = new Coche();
        Peaton peaton = new Peaton();
        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.attach(coche);
        messagePublisher.attach(peaton);
        messagePublisher.notifyUpdate(new Semaforo("ROJO_COCHE"));
        try{
            Thread.sleep(2000);
        }catch (Exception e){}

        messagePublisher.notifyUpdate(new Semaforo("VERDE_COCHE"));
    }

    private static void probarMemento(){
        Carataker carataker = new Carataker();
        Article article = new Article("Alberto", "Memento es una pelicula");
        article.setText(article.getText() + " de Nolan");
        System.out.println(article.getText());

        carataker.addMemento(article.createMemento());
        article.setText(article.getText() + " protagonizada por Guy Pearce");
        System.out.println(article.getText());

        carataker.addMemento(article.createMemento());

        article.setText(article.getText() + " y Leonardo DiCaprio");
        System.out.println(article.getText());

        ArticleMemento memento1 = carataker.getMemento(0);
        ArticleMemento memento2 = carataker.getMemento(1);

        article.restoreMemento(memento1);
        System.out.println(article.getText());


        article.restoreMemento(memento2);
        System.out.println(article.getText());

        article.setText(article.getText() + " del año ");

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
