package patrones.estructurales.adapter;

public class GoldCreditCard implements Secure{

    @Override
    public void payWithSecureLevelA() {}

    @Override
    public void payWithSecureLevelZ() {
        System.out.println("Tarjeta Gold: Pagando con Seguridad BAJA nivel Z");
    }
}
