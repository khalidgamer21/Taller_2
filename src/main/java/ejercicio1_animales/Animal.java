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

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toLowerCase();
    }

    public void setGenero(String genero) {
        this.genero = genero.toLowerCase();
    }

    @Override
    public String toString() {
        return nombre;
    }


}
