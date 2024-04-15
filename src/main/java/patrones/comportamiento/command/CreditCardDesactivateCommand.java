package patrones.comportamiento.command;

public class CreditCardDesactivateCommand implements Command{

    TarjetaCredito creditCard;

    public CreditCardDesactivateCommand(TarjetaCredito creditCard){
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.desactivate();
        creditCard.sendSMSToCustomerDesactivate();
    }
}
