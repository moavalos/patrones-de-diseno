package patrones.creacionales.abstractFactory;

public class Debit implements PaymentMethod{

    @Override
    public String doPayment() {
        return "pago a debito";
    }
}
