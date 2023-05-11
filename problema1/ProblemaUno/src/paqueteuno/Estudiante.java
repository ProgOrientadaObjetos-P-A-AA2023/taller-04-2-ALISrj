package paqueteuno;

public class Estudiante {

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad uni;

//  Constructores
    public Estudiante(double n1, double n2, double n3, Universidad u) {
        nombre = "User-8f09ab9f7b";
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        uni = u;
    }

    public Estudiante(String n, double n1, double n2, double n3, Universidad u) {

        nombre = n;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        uni = u;
    }

//  Métodos establecer    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNota1(double n) {
        nota1 = n;
    }

    public void establecerNota2(double n) {
        nota2 = n;
    }

    public void establecerNota3(double n) {
        nota3 = n;
    }

    public void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }

    public void establecerU(Universidad n) {
        uni = n;
    }

//  Métodos obtener
    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerNota1() {
        return nota1;
    }

    public double obtenerNota2() {
        return nota2;
    }

    public double obtenerNota3() {
        return nota3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public Universidad obtenerUniversidad() {
        return uni;
    }

    @Override
    public String toString() {
        String cadena = String.format("""
                                      Nombre del Estudiante: %s
                                      Nota uno: %.2f
                                      Nota dos: %.2f
                                      Nota tres: %.2f
                                      Promedio: %.2f
                                      Nombre de la Universidad: %s
                                      Direccion de la Universidad: %s
                                      """,
                obtenerNombre(),
                obtenerNota1(),
                obtenerNota2(),
                obtenerNota3(),
                obtenerPromedio(),
                obtenerUniversidad().obtenerNombre(),
                obtenerUniversidad().obtenerDireccion());

        return cadena;
    }

}
