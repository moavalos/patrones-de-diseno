package patrones.creacionales.builder;

public class Card {

    /** definición
     * nos permite producir distintos tipos y representaciones de un objeto complejo empleando el mismo código
     * de construcción, evitando la complejidad de los constructores gigantes.
     * Ejemplo; en lugar de la construcción de una casa, separar en paredes, piso, ventajas, etc.
     **/

    private final String CARD_TYPE;
    private final String NUMBER;
    private final String NAME;
    private final Integer EXPIRES;
    private final Boolean CREDIT;

    private Card(CardBuilder builder){
        this.CARD_TYPE = builder.cardType;
        this.NUMBER = builder.number;
        this.NAME = builder.name;
        this.EXPIRES = builder.expires;
        this.CREDIT = builder.credit;
    }

    public String getCARD_TYPE() {
        return CARD_TYPE;
    }

    public String getNUMBER() {
        return NUMBER;
    }

    public String getNAME() {
        return NAME;
    }

    public Integer getEXPIRES() {
        return EXPIRES;
    }

    public Boolean getCREDIT() {
        return CREDIT;
    }

    @Override
    public String toString() {
        return "Card{" +
                "CARD_TYPE='" + CARD_TYPE + '\'' +
                ", NUMBER='" + NUMBER + '\'' +
                ", NAME='" + NAME + '\'' +
                ", EXPIRES=" + EXPIRES +
                ", CREDIT=" + CREDIT +
                '}';
    }

    public static class CardBuilder{
        private String cardType;
        private String number;
        private String name;
        private Integer expires;
        private Boolean credit;

        public CardBuilder(String cardType, String number){
            this.cardType = cardType;
            this.number = number;
        }

        public CardBuilder name(String name){
            this.name = name;
            return this;
        }

        public CardBuilder expires(Integer expires){
            this.expires = expires;
            return this;
        }

        public CardBuilder credit(Boolean credit){
            this.credit = credit;
            return this;
        }

        public Card build(){
            return new Card(this);
        }

    }
}
