package patrones.comportamiento.visitor;

public class OfertaGasolina implements OfertaElement {

    /** definicion
     * permite agregar operaciones a objetos sin modificar su estructura.
     * Define una nueva operación en una clase separada y aplica esta operación a una colección de objetos.
     */

    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.ofertaGasolina(this);
    }
}
