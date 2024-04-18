package patrones.estructurales.facade;

public class CreditMarket {

    private CreditF gold;
    private CreditF silver;
    private CreditF black;

    /**
     * proporciona una interfaz simplificada a una biblioteca, framework
     * o cualquier otro grupo complejo de clases.
     */

    public CreditMarket(){
        gold = new GoldF();
        silver = new SilverF();
        black = new BlackF();
    }

    public void showCreditGold(){
        gold.showCredit();
    }

    public void showCreditSilver(){
        silver.showCredit();
    }

    public void showCreditBlack(){
        black.showCredit();
    }
}
