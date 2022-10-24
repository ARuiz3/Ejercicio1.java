import java.util.Scanner;

public class Practica10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el peso de la persona en Kg");
        double peso = lector.nextDouble();
        double resultado;
        resultado= (peso/9.81)*1.622;
        System.out.println("El peso en la Luna es de " + resultado + "Kg");
    }
}
