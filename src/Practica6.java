import java.util.Scanner;

public class Practica6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca la velocidad en Km/h");
        double VInicial = lector.nextDouble();
        double vfinal;
        vfinal = VInicial / 3.6;
        System.out.println(VInicial + " Km/h són " + vfinal + " m/s");
    }
}
