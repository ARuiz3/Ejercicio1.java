import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("introduzca el número que desea duplicar y triplicar");
        int num = lector.nextInt();
        int resultado1;
        int resultado2;
        resultado1 = num * 2;
        resultado2 = num * 3;
        System.out.println("El doble de " + num + " és " + resultado1 + " y el triple " + resultado2);
    }
}
