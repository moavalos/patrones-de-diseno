package patrones.comportamiento.chainOfResponsibility;

public class Tarjeta implements ApproveLoanChain {

    /**
     * permite pasar solicitudes a lo largo de una cadena de manejadores.
     * Cada manejador decide si procesa la solicitud o la pasa al siguiente manejador de la cadena.
     */

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
        Gold gold = new Gold();
        this.setNext(gold);

        Platinium platinium = new Platinium();
        gold.setNext(platinium);

        Black black = new Black();
        platinium.setNext(black);

        next.crediCardRequest(totalLoan);
    }
}
