package patrones.creacionales.abstractFactory;

public class PaymentMethodFactory implements Factory<PaymentMethod>{

    /** DEFINICION
     * permite producir familias de objetos relacionados sin especificar clases concretas.
     **/

    @Override
    public PaymentMethod create(String type) {
        if("CREDIT".equals(type))
            return new Credit();
        else if("DEBIT".equals(type))
            return new Debit();
        return null;
    }

}
