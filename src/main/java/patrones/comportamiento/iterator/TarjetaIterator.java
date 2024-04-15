package patrones.comportamiento.iterator;

public class TarjetaIterator implements Iterator{

    private Tarjeta[] cards;
    private int position;

    /** definition
     * proporciona una forma de acceder a los elementos de una colección sin exponer su estructura interna.
     */

    public TarjetaIterator(Tarjeta[] cards){
        this.cards = cards;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < cards.length;
    }

    @Override
    public Object next() {
        return cards[position++];
    }

    @Override
    public Object currentItem() {
        return cards[position];
    }
}
