package patrones.estructurales.bridge;

public class SecureCreditCard implements ICreditCard{

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado CON SEGURIDAD");
    }
}
