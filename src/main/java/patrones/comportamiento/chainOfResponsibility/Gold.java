package patrones.comportamiento.chainOfResponsibility;

public class Gold implements ApproveLoanChain {

    private ApproveLoanChain next;

    @Override
    public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void crediCardRequest(int totalLoan) {
        if (totalLoan <= 10000)
            System.out.println("Esta solicitud de tarjeta de crédito la maneja la tarjeta Gold");
        else
            next.crediCardRequest(totalLoan);
    }
}

