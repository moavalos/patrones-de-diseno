package patrones.estructurales.bridge;

public abstract class CreditCardBridge {

    protected ICreditCard tarjeta;

    protected CreditCardBridge(ICreditCard tarjeta){
        this.tarjeta = tarjeta;
    }

    public abstract void realizarPago();
}
