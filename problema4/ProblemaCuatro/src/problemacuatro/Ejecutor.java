
package problemacuatro;

public class Ejecutor {


    public static void main(String[] args) {

//      Objeto1
        Banco ban1 = new Banco();
        Cliente cli1 = new Cliente("Alex Israel", "Ramírez Jiménez", 
                "132131123");
        Cheque che1 = new Cheque(cli1, ban1, 10000);
        che1.calcularComision();
        System.out.printf("%s",che1);
       
        System.out.println("----------------------------------------------");        
//      Objeto2
        Banco ban2 = new Banco("Banco del Barrio", 3);
        Cliente cli2 = new Cliente("Sebas Alejandro", "Calderón Bobilla");
        Cheque che2 = new Cheque(cli2, ban2);
        che2.calcularComision();
        System.out.printf("%s",che2);
    }
    
}
