import java.util.Scanner;

public class Practica8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Si desea calcular el área de un trinagulo escriba 1");
        System.out.println("Si desea calcular el área de un quadrado escriba 2");
        System.out.println("Si desea calcular el área de un pentágono escriba 3");
        byte selector = lector.nextByte();
        double resultado;
        if (selector == 1) {
            System.out.println("Introduzca la longitud de la base y la altura respectivamente");
            double base = lector.nextDouble();
            double altura = lector.nextDouble();
            resultado = (base * altura) / 2;
            System.out.println("El área de tu triangulo es " + resultado);
        } else if (selector == 2) {
            System.out.println("Introduzca ,la longitud de un lado");
            double lado = lector.nextDouble();
            resultado = lado * lado;
            System.out.println("El área de tu triangulo es " + resultado);
        } else if (selector == 3) {
            System.out.println("Introduzca la longitud del perimetro y del apotema respectivamente");
            double perimetro = lector.nextDouble();
            double apotema = lector.nextDouble();
            resultado = (perimetro*apotema)/2;
            System.out.println("El área de tu pentágono es " + resultado);
        } else {
            System.out.println("El numero introducido no es válido");
        }
    }
}
