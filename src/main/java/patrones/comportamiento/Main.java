package patrones.comportamiento;

import patrones.comportamiento.chainOfResponsibility.Tarjeta;

public class Main {

    public static void main(String[] args) {
        probarChainOfResponsability();
    }

    private static void probarChainOfResponsability(){
        Tarjeta tarjeta = new Tarjeta();
        tarjeta.crediCardRequest(100000);
    }
}
