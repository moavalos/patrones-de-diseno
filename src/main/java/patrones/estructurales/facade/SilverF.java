package patrones.estructurales.facade;

public class SilverF implements CreditF {

    @Override
    public void showCredit() {
        System.out.println("La tarjeta Silver tiene un Crédito de 200.000");
    }
}
