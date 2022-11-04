import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("introduzca los grados que quiere pasar a Farenheit");
        double gradosC = lector.nextDouble();
        calcularGrados(gradosC);

    }
    public static void calcularGrados(double g){
        double resultado;
        if (g >= -273.15) {
            resultado = (32 + (9*g/5));
            System.out.println(g + "º son igual a " + resultado + "K");
        }
        else {
            System.out.println("La temperatura introducida no es posible");
        }
    }

}
