package paqueteuno;

public class Ejecutor {

    public static void main(String[] args) {

//      Creación del primer Objeto
        Universidad u1 = new Universidad();
        Estudiante est1 = new Estudiante("Alex R", 10, 5, 7, u1);
        est1.calcularPromedio();
        System.out.printf("%s",est1);
  
        
        System.out.println("-------------------------------");
        
        
//      Creación del segundo objeto
        Universidad u2 = new Universidad("NASA", "Argelia");
        Estudiante est2 = new Estudiante(10,9,10,u2);
        est2.calcularPromedio();
        System.out.printf("%s",est2);
    }   

}
