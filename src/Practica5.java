import java.util.Scanner;

public class Practica5 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.println("introduzca el radio de la circunferéncia");
        double radio = lector.nextDouble();
        double longitud, area;
        double Pi = Math.PI;
        longitud = Math.pow(radio, 2);
        area = Pi * Math.pow(radio, 2);
        System.out.println("La longitud de la circunferéncia és " + longitud + " y el area és " + area);
    }
}
