package patrones.estructurales.facade;

public class BlackF implements CreditF{

    @Override
    public void showCredit() {
        System.out.println("La tarjeta Black tiene un Crédito de 1.000.000");
    }
}
