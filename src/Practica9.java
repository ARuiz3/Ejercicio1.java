import java.util.Scanner;

public class Practica9 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.println("Indique la distancia en km y el tiempo en horas respectivamente");
        double distancia = lector.nextDouble();
        double tiempo = lector.nextDouble();
        double resultado;
        resultado = distancia/tiempo;
        System.out.println("La velocidad es de " + resultado + "Km/h");

    }
}
