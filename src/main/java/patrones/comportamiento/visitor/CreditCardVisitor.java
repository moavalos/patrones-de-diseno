package patrones.comportamiento.visitor;

public interface CreditCardVisitor {

    void ofertaGasolina(OfertaGasolina ofertaGasolina);

    void ofertaVuelos(OfertaVuelos ofertaVuelos);
}
