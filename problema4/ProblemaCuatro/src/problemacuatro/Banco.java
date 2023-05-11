
package problemacuatro;

public class Banco {
    
    private String nombre;
    private int numSucursales;
    
    public Banco(){
        nombre = "Banco Pichincha";
        numSucursales = 10;
    }
    
    public Banco(String n, int num){
        nombre = n;
        numSucursales = num;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumSucursales(int n){
        numSucursales = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }

    public int obtenerNumSucursales(){
        return numSucursales;
    }
    
}
