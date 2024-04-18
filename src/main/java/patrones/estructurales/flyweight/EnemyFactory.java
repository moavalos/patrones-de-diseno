package patrones.estructurales.flyweight;

import java.util.HashMap;

public class EnemyFactory {

    private static HashMap<String, Enemy> enemigos = new HashMap<>();

    /**
     * permite mantener más objetos dentro de la cantidad disponible de memoria
     * RAM compartiendo las partes comunes del estado entre varios objetos en lugar
     * de mantener toda la información en cada objeto.
     * Útil cuando necesitas manejar una gran cantidad de objetos similares (por ejemplo, caracteres
     * en un procesador de texto) sin agotar la memoria.
     */

    public static Enemy getEnemy(String type){
        Enemy enemy = null;
        if(enemigos.containsKey(type)){
            enemy = enemigos.get(type);
        }else {
            switch (type){
                case "Private":
                    System.out.println("Soldado ha sido creado");
                    enemy = new Private();
                    break;
                case "Detective":
                    System.out.println("Detective ha sido creado");
                    enemy = new Detective();
                    break;
                default:
                    System.out.println("No se ha creado enemigo");
            }
            enemigos.put(type, enemy);
        }
        return enemy;
    }
}
