package patrones.comportamiento.templateMethod;

public class Paypal extends PaymentTemplate{

    @Override
    void initialize() {
        System.out.println("Inicializando el pago con Paypal...");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con Paypal...");
    }

    @Override
    void endPayment() {
        System.out.println("Finalizado el pago a través de los servidores Paypal...");
    }
}
