package patrones.comportamiento.strategy;

public class Context {
    private StragetyTextFormatter stragetyTextFormatter;

    /** definicion
     * permite que un objeto altere su comportamiento cuando su estado interno cambia
     */

    public Context(StragetyTextFormatter stragetyTextFormatter){
        this.stragetyTextFormatter = stragetyTextFormatter;
    }

    public void publishText(String text){
        stragetyTextFormatter.format(text);
    }
}
