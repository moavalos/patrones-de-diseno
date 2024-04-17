package patrones.estructurales.decorator;

public class SecureDecorator extends CreditDecorator {

    public SecureDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    /**
     * añade funcionalidades a objetos colocándolos dentro de objetos
     * encapsuladores especiales que contienen estas funcionalidades.
     * Ejemplo; clase Café, decorarla con clase Leche, clase Azúcar
     */

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configSecure();
    }

    private void configSecure(){
        System.out.println("La tarjeta ha sido configurada con Seguridad Máxima");
    }
}
