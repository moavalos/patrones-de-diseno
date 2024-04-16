package patrones.comportamiento.memento;

public class ArticleMemento {
    private String autor;
    private String text;

    /**
     * permite capturar y restaurar el estado interno de un objeto sin violar su encapsulación.
     */

    public ArticleMemento(String autor, String text){
        this.autor = autor;
        this.text = text;
    }

    public String getAutor() {
        return autor;
    }

    public String getText() {
        return text;
    }
}
