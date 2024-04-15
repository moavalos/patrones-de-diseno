package patrones.creacionales;

import patrones.creacionales.abstractFactory.*;
import patrones.creacionales.prototype.PrototypeCard;
import patrones.creacionales.prototype.PrototypeFactory;
import patrones.creacionales.singleton.CardSingleton;

import static patrones.creacionales.prototype.PrototypeFactory.Cartype.MASTERCARD;
import static patrones.creacionales.prototype.PrototypeFactory.Cartype.VISA;

public class Main {

    /** CREACIONALES
     *  Usados en lugar de instancia directa. Concierne al proceso de creación de objetos.
     **/

    public static void main(String[] args){
        probarFactoryMethod();
        probarAbstractMethod();
        probarBuilder();
        probarPrototype();
        probarSinglenton();
    }

    private static void probarSinglenton(){
        CardSingleton.getINSTANCE().setCardNumber("1234-1234-1234-1324");
        System.out.println(CardSingleton.getINSTANCE().getCardNumber());
    }

    private static void probarPrototype() {
        PrototypeFactory.loadCard();
        try {
            PrototypeCard visa = PrototypeFactory.getInstance(VISA);
            visa.getCard();

            PrototypeCard master = PrototypeFactory.getInstance(MASTERCARD);
            master.getCard();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }

    public static void probarBuilder(){
        patrones.creacionales.builder.Card card = new patrones.creacionales.builder.Card.CardBuilder("VISA", "0000 0000 0000 0000")
                .name("Pedro")
                .expires(2027)
                .credit(true)
                .build();

        System.out.println(card);
    }

    public static void probarAbstractMethod(){
        Factory abstractFactory = FactoryProvider.getFactory("Card");
        Card tarjeta = (Card) abstractFactory.create("VISA");
        Factory abstractFactory2 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory2.create("DEBIT");

        System.out.println("tarjeta de " + tarjeta.getCardType() + " con el metodo de pago " + paymentMethod.doPayment());
    }

    public static void probarFactoryMethod(){
        //Payment payment = PaymentMethodFactory.doPlayment(Typ)
    }
}
