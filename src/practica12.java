import java.io.IOException;
import java.util.Scanner;

public class practica12 {
    public static void main(String[] args) throws IOException {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca un carácter");
        char caracter = (char) System.in.read();
        if (Character.isUpperCase(caracter)){
            System.out.println(caracter + " es una letra mayuscula");

        }
        else {
            System.out.println(caracter + "No es mayuscula");
        }
    }

}
