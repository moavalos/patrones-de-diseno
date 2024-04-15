package patrones.comportamiento.iterator;

public class CardList implements List{

    private Tarjeta[] cards;

    public CardList(Tarjeta[] cards){
        this.cards = cards;
    }

    @Override
    public Iterator iterator() {
        return new TarjetaIterator(cards);
    }
}
