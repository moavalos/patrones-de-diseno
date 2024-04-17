package patrones.estructurales.adapter;

public class Adapter implements PaymentAdapter {

    Secure secureCreditCard;

    /**
     * permite adaptar una interfaz existente a otra interfaz.
     * Actúa como intermediario entre dos interfaces incompatibles y
     * proporciona una capa adicional de abstracción para permitir que los objetos trabajen juntos.
     */

    public Adapter(String type){
        if(type.equals("black"))
            secureCreditCard = new BlackCreditCard();
        else if(type.equals("gold"))
            secureCreditCard = new GoldCreditCard();
    }

    @Override
    public void pay(String type) {
        if (type.equals("black"))
            secureCreditCard.payWithSecureLevelA();
        else if (type.equals("gold"))
            secureCreditCard.payWithSecureLevelZ();
    }
}
