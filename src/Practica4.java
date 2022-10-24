import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("introduzca los grados que quiere pasar a Farenheit");
        double gradosC = lector.nextDouble();
        double resultado;
        if (gradosC >= -273.15) {
            resultado = gradosC + 273.15;
            System.out.println(gradosC + "º son igual a " + resultado + "K");
        }
        else {
            System.out.println("La temperatura introducida no es posible");
        }
    }

}
