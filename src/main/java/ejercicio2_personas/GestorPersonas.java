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
    }
}
