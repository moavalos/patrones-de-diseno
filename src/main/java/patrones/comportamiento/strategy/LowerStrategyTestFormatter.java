package patrones.comportamiento.strategy;

public class LowerStrategyTestFormatter implements StragetyTextFormatter {

    @Override
    public void format(String text) {
        System.out.println("Texto en Minusculas: " + text.toLowerCase());
    }
}
