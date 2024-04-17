package patrones.estructurales.bridge;

public class ClassicCreditCard extends CreditCardBridge {

    public ClassicCreditCard(ICreditCard tarjeta){
        super(tarjeta);
    }

    /**
     * permite dividir una clase grande o un grupo de clases estrechamente relacionadas
     * en dos jerarquías separadas: la abstracción y la implementación.
     * Estas dos jerarquías pueden desarrollarse independientemente la una de la otra*/

    @Override
    public void realizarPago() {
        tarjeta.realizarPago();
    }
}
