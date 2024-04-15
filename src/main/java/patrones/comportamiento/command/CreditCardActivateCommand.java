package patrones.comportamiento.command;

public class CreditCardActivateCommand implements Command{

    TarjetaCredito creditCard;

    public CreditCardActivateCommand(TarjetaCredito creditCard){
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.sendPinNumberToCustomer();
        creditCard.activate();
        creditCard.sendSMSToCustomerActivate();
    }
}
