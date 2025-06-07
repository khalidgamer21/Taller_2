package ejercicio1_animales;

import java.util.*;
public class ClasificadorAnimales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animales = new ArrayList<>();
        Map<String, List<Animal>> clasificacion = new TreeMap<>();
        clasificacion.put("terrestre", new ArrayList<>());
        clasificacion.put("acuatico", new ArrayList<>());
        clasificacion.put("aereo", new ArrayList<>());

    }
}