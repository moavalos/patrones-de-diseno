package patrones.comportamiento.state;

public class MobileAlertStateContext {

    private MobileAlertState currentState;

    /**
     * permite que un objeto altere su comportamiento cuando su estado interno cambia.
     */

    public MobileAlertStateContext(){
        currentState = new Sound();
    }

    public void setState(MobileAlertState state){
        currentState = state;
    }

    public void alert(){
        currentState.alert(this);
    }
}
