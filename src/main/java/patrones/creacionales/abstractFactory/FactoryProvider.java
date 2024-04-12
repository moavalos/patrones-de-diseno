package patrones.creacionales.abstractFactory;

public class FactoryProvider {

    public static Factory getFactory(String chooseFactory){
        if("Card".equals(chooseFactory))
            return new CardFactory();
        else if ("PaymentMethod".equals(chooseFactory))
            return new PaymentMethodFactory();
        return null;
    }

}
