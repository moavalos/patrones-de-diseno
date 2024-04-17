package patrones.comportamiento.strategy;

public class CapitalStrategyTextFormatter  implements StragetyTextFormatter  {

    @Override
    public void format(String text) {
        System.out.println("Texto en Mayusculas: " + text.toUpperCase());
    }
}
