package paqueteuno;

public class Universidad {

    private String nombre;
    private String direccion;

    public Universidad(){
        nombre = "UTPL";
        direccion = "Calle Paris";
    }
    
    public Universidad(String n, String dir) {

        nombre = n;
        direccion = dir;

    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerDireccion(String dir) {
        direccion = dir;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDireccion() {
        return direccion;
    }

}
