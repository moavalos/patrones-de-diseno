package patrones.creacionales.abstractFactory;

public class Credit implements PaymentMethod{

    @Override
    public String doPayment() {
        return "pago a credito";
    }
}
