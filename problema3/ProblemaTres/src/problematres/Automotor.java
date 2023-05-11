package problematres;

public class Automotor {

    private String cedula;
    private Fabricante fabr;
    private int anioF;
    private double valor;
    private double valorMatricula;

    public Automotor(String c, Fabricante f, int a, double v) {
        cedula = c;
        fabr = f;
        anioF = a;
        valor = v;
    }

    public Automotor(Fabricante f, int a, double v) {
        cedula = "000";
        fabr = f;
        anioF = a;
        valor = v;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerFabricante(Fabricante f) {
        fabr = f;
    }

    public void estableceranioF(int a) {
        anioF = a;
    }

    public void establecerValor(double v) {
        valor = v;
    }

    public void calcularValorMatricula() {
        valorMatricula = 0.00002 * (valor * (2023 - anioF));
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Fabricante obtenerFabricante() {
        return fabr;
    }

    public int obteneranioF() {
        return anioF;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("""
                                      Cédula: %s
                                      Nombre del Fabricante: %s
                                      Origen del Fabricante: %s
                                      Año de Fabricación: %d
                                      Valor del automotor: %.2f
                                      Valor de la matrícula: %.2f
                                      """,
                obtenerCedula(),
                obtenerFabricante().obtenerNombre(),
                obtenerFabricante().obtenerOrigen(),
                obteneranioF(),
                obtenerValor(),
                obtenerValorMatricula());
        return cadena;
    }

}
