import java.util.Scanner;

public class Practica5 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.println("introduzca el radio de la circunferéncia");
        double radio = lector.nextDouble();
        area(radio);
        longitud(radio);
    }
    public static void area(double r){
        double area;
        area = Math.PI * Math.pow(r, 2);
        System.out.println("El area de la circunferéncia és " + area);
    }
    public static void longitud(double r){
        double longitud;
        longitud = 2 * Math.PI * r;
        System.out.println("La longitud de la circunferéncia és "+ longitud);
    }
}