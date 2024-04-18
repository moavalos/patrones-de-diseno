package patrones.estructurales.proxy;

public class AccessToInternet implements Internet {

    /**
     * sustituto o marcador de posición para otro objeto.
     * Controla el acceso al objeto original, permitiendo hacer algo
     * antes o después de que la solicitud llegue al objeto original.
     */

    @Override
    public void connectTo(String url) throws Exception {
        System.out.println("Conectando a: " + url);
    }
}
