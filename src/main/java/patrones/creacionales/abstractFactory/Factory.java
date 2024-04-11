package patrones.creacionales.abstractFactory;

public interface Factory<T> {

    // interfaz para la creacion de objetos de productos abstractos

    T create(String type);
}
