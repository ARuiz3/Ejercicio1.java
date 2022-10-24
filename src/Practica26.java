import java.util.Scanner;

public class Practica26 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        byte contpositivo = 0, contnegativo = 0;
        double[] num = new double[10];
        int i;
        double numintr ;
        for (i = 0; i < 10; i++) {
            System.out.println("Introduce un numero");
            numintr = lector.nextDouble();
            num[i] =  numintr;
            if (num[i] < 0){
                contnegativo++;
            }
            else {
                contpositivo++;
            }
        }
        for (i=0; i< 10;i++){
            System.out.println("Has introducido: " + num[i]);

        }
        System.out.println("Tienes " + contnegativo + " numeros negativos y " + contpositivo + " numeros positivos");
    }
}
