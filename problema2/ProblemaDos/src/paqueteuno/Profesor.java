package paqueteuno;

public class Profesor {

    private String nombre;
    private String apellido;
    private double sueldoB;
    private double sueldoT;
    private String cedula;
    private Provincia prov;

    public Profesor(double b, String c, Provincia p) {
        nombre = "Norman";
        apellido = "Armijos";
        sueldoB = b;
        cedula = c;
        prov = p;
    }

    public Profesor(String n, String a, double b, String c, Provincia p) {
        nombre = n;
        apellido = a;
        sueldoB = b;
        cedula = c;
        prov = p;
    }

//  Métodos establecer
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellidos(String n) {
        apellido = n;
    }

    public void establecerSueldoB(double b) {
        sueldoB = b;
    }

    public void calcularSueldoT() {
        sueldoT = sueldoB * 1.20;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerProvincia(Provincia p) {
        prov = p;
    }
//  Métodos establecer

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoB() {
        return sueldoB;
    }

    public double obtenerSueldoT() {
        return sueldoT;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Provincia obtenerProvincia() {
        return prov;
    }

    @Override
    public String toString() {
        String cadena = String.format("""
                                  Nombre: %s
                                  Apellido: %s
                                  Sueldo Básico: %.2f
                                  Sueldo Total: %.2f
                                  Cédula: %s
                                  Nombre de la Provincia: %s
                                  Número de habitante: %d
                                  """,
                 obtenerNombre(),
                 obtenerApellido(),
                 obtenerSueldoB(),
                 obtenerSueldoT(),
                 obtenerCedula(),
                 obtenerProvincia().obtenerNombre(),
                 obtenerProvincia().obtenerNumHab());
        return cadena;
    }
}
