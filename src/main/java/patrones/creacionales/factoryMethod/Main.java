package patrones.creacionales.factoryMethod;

public class Main {

    // https://refactoring.guru/es/design-patterns/factory-method

    public static void main(String[] args){
        probandoFactoryMethod();
    }

    /** DEFINICIÓN
     * proporciona una interfaz para crear objetos en una superclase,
     * mientras permite a las subclases alterar el tipo de objetos que se crearán.
     *
     * separa el código de construcción de producto del código que hace uso del producto.
     * es más fácil extender el código de construcción de producto de forma independiente al resto del código.
     **/

    private static void probandoFactoryMethod(){
        Payment payment = new MercadoPago();
        payment.doPlayment();
    }

    /**
     * Desventajas;
     *  - te hace crear muchas clases
     **/
}
