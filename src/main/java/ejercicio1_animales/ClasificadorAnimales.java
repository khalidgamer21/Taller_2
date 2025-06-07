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



    private static String seleccionarTipo(Scanner scanner) {
        while (true) {
            System.out.println("Selecciona el tipo de animal:");
            System.out.println("1. Terrestre");
            System.out.println("2. Acuático");
            System.out.println("3. Aéreo");
            System.out.print("Opción: ");
            String opcion = scanner.nextLine();

            switch (opcion.toLowerCase()) {
                case "1": case "t": return "terrestre";
                case "2": case "a": return "acuatico";
                case "3": case "e": return "aereo";
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }
    }

    private static String seleccionarGenero(Scanner scanner) {
        while (true) {
            System.out.println("Selecciona el género:");
            System.out.println("M. Masculino");
            System.out.println("F. Femenino");
            System.out.print("Opción: ");
            String opcion = scanner.nextLine().toLowerCase();

            switch (opcion) {
                case "m": return "masculino";
                case "f": return "femenino";
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

}