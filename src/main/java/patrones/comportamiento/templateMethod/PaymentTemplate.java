package patrones.comportamiento.templateMethod;

public abstract class PaymentTemplate {

    abstract void initialize();
    abstract void startPayment();
    abstract void endPayment();

    public final void makePayment(){
        initialize();
        startPayment();
        endPayment();
    }
}
