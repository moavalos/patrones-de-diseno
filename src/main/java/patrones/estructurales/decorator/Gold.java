package patrones.estructurales.decorator;

public class Gold implements Credit {

    @Override
    public void showCredit() {
        System.out.println("El crédito es de 50.000");
    }
}
