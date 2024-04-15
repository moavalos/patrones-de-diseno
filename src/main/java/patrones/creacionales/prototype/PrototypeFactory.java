package patrones.creacionales.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    public static class Cartype{

        public static final String VISA = "visa";
        public static final String MASTERCARD = "mastercard";
    }

    /** DEFINITION
     * permite copiar objetos existentes sin que el código dependa de sus clases.
     * Cada clase concreta que necesita ser clonada implementa este método.
     * El proceso de clonado crea un nuevo objeto a partir de la misma clase y copia los
     * valores de campo del objeto original al nuevo.
     */
    public static Map<String, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(final String tipo) throws CloneNotSupportedException {
        return prototypes.get(tipo).clone();
    }

    public static void loadCard(){
        Visa visa = new Visa();
        visa.setName("VISA");
        prototypes.put(Cartype.VISA, visa);

        Mastercard mastercard = new Mastercard();
        mastercard.setName("MASTERCARD");
        prototypes.put(Cartype.MASTERCARD, mastercard);
    }
}
