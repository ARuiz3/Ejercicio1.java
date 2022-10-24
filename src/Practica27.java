import java.util.Scanner;

public class Practica27 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double factorial = 1;
        System.out.println("Introduzca el numero del que desee hacer el factorial");
        double numero = lector.nextDouble();
        while (numero != 0){
            factorial = factorial * numero; numero--;
        }
        System.out.println("el factorial es: " + factorial);

    }
}
