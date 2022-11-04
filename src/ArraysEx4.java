import java.util.Random;
import java.util.Scanner;

public class ArraysEx4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el tamaño deseado para el array");
        int tamano = lector.nextInt();
        int[] array = new int[tamano];
        insArray(array);
        System.out.println("La array es:");
        imprimirArray(array);
        System.out.println("\nLa suma de la array es:");
        sumaArray(array);
    }
    public static void insArray(int[] lista){
        for (int i=0;lista.length>i;i++){
            int num=0;
            num = randomNum();
            lista[i]=num;
        }
    }
    private static int randomNum(){
        Random random = new Random();
        return random.nextInt(0,99);
    }
    public static void imprimirArray(int[] lista) {
        for (int y = 0; y < lista.length; y++) {
            System.out.print(lista[y] + "(" + y + ") ");
        }
    }
    public static void sumaArray(int[] lista){
        int suma=0;
        for (int j=0;j<lista.length;j++){
            suma+= lista[j];
        }
        System.out.println(suma);
    }
}
