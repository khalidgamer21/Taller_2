package ejercicio1_animales;

public class Animal {
    private String nombre;
    private String tipo; // terrestre, aéreo, acuático
    private String genero; // masculino, femenino

    public Animal(String nombre, String tipo, String genero) {
        this.nombre = nombre;
        this.tipo = tipo.toLowerCase();
        this.genero = genero.toLowerCase();
    }


}
