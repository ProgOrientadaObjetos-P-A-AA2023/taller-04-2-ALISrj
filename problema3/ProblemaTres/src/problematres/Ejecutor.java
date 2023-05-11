package problematres;

public class Ejecutor {

    public static void main(String[] args) {

//      objeto1
        Fabricante fa1 = new Fabricante();
        Automotor a1 = new Automotor("1150631511", fa1, 2015, 10000);
        a1.calcularValorMatricula();
        System.out.printf("%s", a1);
        System.out.println("--------------------------------------------------");
//      objeto2
        Fabricante fa2 = new Fabricante("Suzuki", "Japón");
        Automotor a2 = new Automotor(fa2, 2018, 50000);
        a2.calcularValorMatricula();
        System.out.printf("%s", a2);
    }

}
