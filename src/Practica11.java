import java.util.Scanner;

public class Practica11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca un numero entero ");
        long numero = lector.nextLong();
        if(numero % 2 == 0){
            System.out.println(numero + " es par");

        }
        else {
            System.out.println(numero + " es impar");
        }
    }

}
