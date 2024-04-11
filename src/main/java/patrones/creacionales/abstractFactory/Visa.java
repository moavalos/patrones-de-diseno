package patrones.creacionales.abstractFactory;

public class Visa implements Card{

    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "4761 4832 4234 2121";
    }
}
