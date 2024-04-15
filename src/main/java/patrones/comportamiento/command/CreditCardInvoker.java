package patrones.comportamiento.command;

public class CreditCardInvoker {

    private Command command;

    public CreditCardInvoker(){}

    /** definicion
     * encapsula una solicitud como un objeto, permitiendo parametrizar cleintes
     * con diferentes solicitudes, encolarlas o registrar su ejecución
     */
    public void setCommand(Command command){
        this.command = command;
    }

    public void run(){
        command.execute();
    }
}
