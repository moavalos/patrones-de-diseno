package patrones.comportamiento.mediator;

public abstract class Colleage {

    /** definicion
     * define un objeto que coordina las interacciones entre otros objetos,
     * evitando que se comuniquen directamente entre sí
     * */

    protected Mediator mediator;

    public Colleage(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void messageReceived(String message);
}
