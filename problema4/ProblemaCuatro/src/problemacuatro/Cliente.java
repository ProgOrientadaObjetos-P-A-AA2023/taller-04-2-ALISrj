package problemacuatro;

public class Cliente {

    private String nombres;
    private String apellidos;
    private String cedula;

    public Cliente(String n, String a, String c) {
        nombres = n;
        apellidos = a;
        cedula = c;
    }

    public Cliente(String n, String a) {
        nombres = n;
        apellidos = a;
        cedula = "000";
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerApellidos(String a) {
        apellidos = a;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerCedula() {
        return cedula;
    }

}
