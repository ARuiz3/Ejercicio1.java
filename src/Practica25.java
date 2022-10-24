import java.util.Scanner;

public class Practica25 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca su calificación");
        byte nota = lector.nextByte();
        switch (nota) {
            case 1, 2, 3, 4 -> System.out.println("Has suspendido");
            case 5 -> System.out.println("Suficiente");
            case 6 -> System.out.println("Bien");
            case 7 -> System.out.println("Notable bajo");
            case 8 -> System.out.println("Notable alto");
            case 9 -> System.out.println("Excelente");
            case 10 -> System.out.println("Matrícula de honor");
            default -> System.out.println("La nota introducida no es correcta");
        }
    }
}
