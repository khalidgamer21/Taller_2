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

        System.out.println("=== Clasificador de Animales ===");

        String opcion;
        do {
            System.out.print("Nombre del animal: ");
            String nombre = scanner.nextLine();

            String tipo = seleccionarTipo(scanner);
            String genero = seleccionarGenero(scanner);

            Animal animal = new Animal(nombre, tipo, genero);
            animales.add(animal);
            clasificacion.get(tipo).add(animal);

            System.out.print("¿Deseas agregar otro animal? (s/n): ");
            opcion = scanner.nextLine().toLowerCase();
        } while (opcion.equals("s"));

        System.out.println("\n=== Animales Clasificados ===");
        for (Map.Entry<String, List<Animal>> entry : clasificacion.entrySet()) {
            System.out.println(capitalize(entry.getKey()) + ":");
            for (Animal a : entry.getValue()) {
                System.out.println("  - " + a.getNombre() + " (" + a.getGenero() + ")");
            }
        }

        scanner.close();

    }
}