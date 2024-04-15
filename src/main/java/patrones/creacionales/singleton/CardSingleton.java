package patrones.creacionales.singleton;

public class CardSingleton {

    private static CardSingleton INSTANCE;
    private String cardNumber;

    private CardSingleton(){}

    public synchronized static CardSingleton getINSTANCE(){
        if(INSTANCE == null)
            INSTANCE = new CardSingleton();
        return INSTANCE;
    }

    /** DEFINITION
     * garantiza que solo exista una única instancia de una clase.
     * Implementación; Hacer privado el constructor por defecto para evitar que otros objetos
     * utilicen el operador new con la clase Singleton.
     * Crear un método de creación estático que actúe como constructor.
     * Este método invoca al constructor privado para crear un objeto y lo guarda en un campo estático.
     * Las siguientes llamadas a este método devuelven el objeto almacenado en caché.
     **/

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

}
