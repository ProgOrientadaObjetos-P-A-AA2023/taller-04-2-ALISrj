package paqueteuno;

public class Provincia {

    private String nombre;
    private int numHab;

    public Provincia() {
        nombre = "Loja";
        numHab = 12376123;
    }

    public Provincia(String n, int num) {
        nombre = n;
        numHab = num;
    }

//  métodos establecer
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNumHab(int n) {
        numHab = n;
    }

//  métodos obtener
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumHab() {
        return numHab;
    }
}
