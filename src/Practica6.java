import java.util.Scanner;

public class Practica6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca la velocidad en Km/h");
        double vinicial = lector.nextDouble();
        velocidadFinal(vinicial);
    }
    public static void velocidadFinal(double v){
        double resultado;
        resultado = v / 3.6;
        System.out.println(v+ " Km/h són " + resultado + " m/s");
    }
}
