package patrones.comportamiento.templateMethod;

public class VisaTemplate extends PaymentTemplate{

    @Override
    void initialize() {
        System.out.println("Inicializando el pago con Visa...");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con Visa...");
    }

    @Override
    void endPayment() {
        System.out.println("Finalizado el pago a través de los servidores Visa...");
    }
}
