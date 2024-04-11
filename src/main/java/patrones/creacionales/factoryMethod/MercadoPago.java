package patrones.creacionales.factoryMethod;

public class MercadoPago implements Payment{

    @Override
    public void doPlayment() {
        System.out.println("Pagando con MercadoPago c:");
    }
}
