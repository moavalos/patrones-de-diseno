package patrones.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

    private List<Observer> observers = new ArrayList<>();

    /**
     * define una dependencia uno a muchos entre objetos,
     * de modo que cuando un objeto cambia de estado, todos sus observadores
     * son notificados y actualizados automáticamente.
     */

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void dettach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Semaforo semaforo) {
        for(Observer o: observers){
            o.update(semaforo);
        }
    }
}
