package problemacuatro;

public class Cheque {

    private Cliente cliente;
    private Banco banco;
    private double valorCh;
    private double comision;

    public Cheque(Cliente c, Banco b, double v) {
        cliente = c;
        banco = b;
        valorCh = v;
    }

    public Cheque(Cliente c, Banco b) {
        cliente = c;
        banco = b;
        valorCh = 1000;
    }

    public void establecerCliente(Cliente c) {
        cliente = c;
    }

    public void establecerBanco(Banco b) {
        banco = b;
    }

    public void establecerValorCh(double v) {
        valorCh = v;
    }

    public void calcularComision() {
        comision = valorCh * 0.00003;
    }

    
    public Cliente obtenerCliente() {
        return cliente;
    }

    public Banco obtenerBanco() {
        return banco;
    }

    public double obtenerValorCh() {
        return valorCh;
    }

    public double obtenerComision() {
        return comision;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("""
                                      Nombres del Cliente: %s
                                      Apellidos del Cliente: %s
                                      Cédula del Cliente: %s
                                      Nombre del Banco: %s
                                      Sucursales del Banco: %d
                                      Valor del cheque: %.2f
                                      Valor de la comisión: %.2f
                                      """
        , obtenerCliente().obtenerNombres()
        , obtenerCliente().obtenerApellidos()
        , obtenerCliente().obtenerCedula()
        , obtenerBanco().obtenerNombre()
        , obtenerBanco().obtenerNumSucursales()
        , obtenerValorCh()
        , obtenerComision());
        return cadena;
    }
    
}
