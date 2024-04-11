package patrones.creacionales.factoryMethod;

public class CardPayment implements Payment{

    @Override
    public void doPlayment() {
        System.out.println("Pagando con tarjeta de credito");
    }
}
