package patrones.creacionales.factoryMethod;

public class CardPayment implements Payment{

    /** Definition
     * proporciona una interfaz para crear objetos en una superclase,
     * mientras permite a las subclases alterar el tipo de objetos que se crearán.
     */

    @Override
    public void doPlayment() {
        System.out.println("Pagando con tarjeta de credito");
    }
}
