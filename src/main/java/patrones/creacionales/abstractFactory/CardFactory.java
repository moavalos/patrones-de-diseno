package patrones.creacionales.abstractFactory;

public class CardFactory implements Factory<Card>{

    @Override
    public Card create(String type) {
        if ("VISA".equals(type))
            return new Visa();
        else if("MASTERCARD".equals(type))
            return new MasterCard();

        return null;
    }

}
