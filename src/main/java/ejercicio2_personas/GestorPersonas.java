package ejercicio2_personas;
import java.util.*;


public class GestorPersonas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        String opcion;
        do {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.print("Género (M/F): ");
            String genero = scanner.nextLine().toUpperCase();

            System.out.print("Sueldo por hora: ");
            double sueldoHora = Double.parseDouble(scanner.nextLine());

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine().toLowerCase();

            Persona p = new Persona(nombre, apellido, edad, genero, sueldoHora, cargo);
            personas.add(p);

            System.out.print("¿Desea ingresar otra persona? (s/n): ");
            opcion = scanner.nextLine().toLowerCase();
        } while (opcion.equals("s"));

        System.out.println("\n=== Estadísticas con Streams ===");




        // a. Cantidad de personas
        long totalPersonas = personas.stream().count();
        System.out.println("Cantidad total de personas: " + totalPersonas);

        // b. Promedio de edades
        double promedioEdad = personas.stream()
                .mapToInt(Persona::getEdad)
                .average()
                .orElse(0);
        System.out.println("Promedio de edades: " + promedioEdad);

        // c. Personas mayores de edad
        long mayoresEdad = personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .count();
        System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad);

        // d. Personas con nombre que empieza con "A"
        System.out.println("Personas con nombre que empieza con 'A':");
        personas.stream()
                .filter(p -> p.getNombre().toLowerCase().startsWith("a"))
                .forEach(p -> System.out.println("  - " + p.getNombre()));








    }
}
