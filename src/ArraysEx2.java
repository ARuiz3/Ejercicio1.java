import java.util.Random;
import java.util.Scanner;

public class ArraysEx2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        int array1[] = new int[20];
        int array2[] = new int[20];
        int numeros=0, i;
        for(i=0; i< array1.length;i++){
            numeros = random.nextInt(0,99);
            array1[i] = numeros;
            if (esPrimo(numeros)){
                array2[i] = numeros;
            }
        }
        System.out.println("Array 1:");
        for(i=0; i< array1.length;i++){
            System.out.printf("%d ",array1[i]);
        }
        System.out.println("\nArray 2:");
        for(i=0; i< array1.length;i++){
            System.out.printf("%d ",array2[i]);
        }

    }
    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0){
                return false;
            }
        }
        return true;
    }
}
