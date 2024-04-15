package patrones.creacionales.prototype;

public class Mastercard implements PrototypeCard{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("tarjeta mastercard");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        return (Mastercard) super.clone();
    }
}
