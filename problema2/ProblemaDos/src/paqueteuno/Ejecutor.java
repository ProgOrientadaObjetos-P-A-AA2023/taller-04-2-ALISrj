package paqueteuno;

public class Ejecutor {

    public static void main(String[] args) {

//      Objeto1
        Provincia prov1 = new Provincia();
        Profesor prof1 = new Profesor("Manuel", "Alvarado", 500,
                "1150631511", prov1);
        prof1.calcularSueldoT();
        System.out.printf("%s", prof1);
        
        
        System.out.println("-----------------------------------------------");
//      Objeto2
        
        Provincia prov2 = new Provincia("El Oro",45000);
        Profesor prof2 = new Profesor(45000, "12313121", prov2);
        prof2.calcularSueldoT();
        System.out.printf("%s", prof2);
        
    }

}
