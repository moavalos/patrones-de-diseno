package patrones.estructurales.facade;

public class GoldF implements CreditF {

    @Override
    public void showCredit() {
        System.out.println("La tarjeta Gold tiene un Crédito de 5.000");
    }
}
