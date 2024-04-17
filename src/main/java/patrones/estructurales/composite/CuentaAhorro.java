package patrones.estructurales.composite;

public class CuentaAhorro implements CuentaComponent {

    private Double amount;
    private String name;

    /**
     * permite componer objetos en estructuras de árbol y trabajar con esas
     * estructuras como si fueran objetos individuales.
     */

    public CuentaAhorro(Double amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void showAccountName() {
        System.out.println("Cuenta Ahorro: " + name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
