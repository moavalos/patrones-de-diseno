package patrones.comportamiento.state;

public class Sound implements MobileAlertState {

    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("Ring...Ring...");

    }
}
