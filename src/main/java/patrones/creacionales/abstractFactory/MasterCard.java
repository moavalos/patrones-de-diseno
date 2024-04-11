package patrones.creacionales.abstractFactory;

public class MasterCard implements Card{

    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getCardNumber() {
        return "4781 3355 4233 5412";
    }
}
