package problematres;

public class Fabricante {

    private String nombre;
    private String origen;

    public Fabricante() {
        nombre = "Toyota";
        origen = "Japón";
    }

    public Fabricante(String n, String o) {
        nombre = n;
        origen = o;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerOrigen(String o) {
        origen = o;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerOrigen() {
        return origen;
    }

}
