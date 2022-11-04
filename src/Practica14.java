import java.util.Scanner;

public class Practica14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce dos palabras");
        String c1 = lector.next();
        String c2 = lector.next();
        if (c1.equals(c2)) {
            System.out.println(c1 + " y " + c2 + " son iguales");
        }
        else{
            System.out.println(c1 + " y " + c2 + " no son iguales");
        }


    }
}
