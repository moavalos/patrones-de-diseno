package patrones.creacionales.prototype;

public class Visa implements PrototypeCard {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("tarjeta visa");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        return (Visa) super.clone();
    }
}
