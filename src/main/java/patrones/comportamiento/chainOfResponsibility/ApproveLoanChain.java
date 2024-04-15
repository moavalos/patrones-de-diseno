package patrones.comportamiento.chainOfResponsibility;

public interface ApproveLoanChain {

    void setNext(ApproveLoanChain loan);
    ApproveLoanChain getNext();
    void crediCardRequest(int totalLoan);
}
