import java.util.Scanner;

public class Practica15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca dos carácteres");
        char caracter1 = lector.next().charAt(0);
        char caracter2 = lector.next().charAt(0);
        if (Character.isLowerCase(caracter1)&&(Character.isLowerCase(caracter2))){
            System.out.println(caracter1 + " y " + caracter2 + " son minúsculas");

        }
        else {
            System.out.println("No son minusculas");
        }
    }

}

