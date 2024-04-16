package patrones.comportamiento.observer;

public class Peaton implements Observer {

    @Override
    public void update(Semaforo semaforo) {
        if(semaforo.status.equals("ROJO_COCHE")){
            System.out.println("Semaforo Verde para Peaton: -> Peaton SI puede pasar");
        }else{
            System.out.println("Semaforo Rojo para Peaton: -> Peaton NO puede pasar");

        }
    }
}
