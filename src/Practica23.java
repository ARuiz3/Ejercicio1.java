import java.util.Scanner;

public class Practica23 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca un dia de la semana en número");
        byte dia = lector.nextByte();
        switch (dia) {
            case 1, 2, 3, 4, 5 -> System.out.println("Es laboral");
            case 6, 7 -> System.out.println("Es festivo");
        }
        if ((dia < 0) || (dia >7)){
            System.out.println("El número introducido no es correcto");
        }
    }
}
