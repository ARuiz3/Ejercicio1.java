import java.util.Random;
import java.util.Scanner;

public class ArraysEx5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el tamaño deseado para el array");
        int tamano = lector.nextInt();
        int[] array = new int[tamano];
        int posicion1=0,mayor=Integer.MIN_VALUE;
        insArray(array);
        System.out.println("La array es:");
        imprimirArray(array);
        for (int i=0;i< array.length;i++){
            if (esMayor(array)){
                posicion1=i;
                mayor=array[i];
            }
         }
        System.out.println("\nEl número mayor és:");
        System.out.println(mayor + "(" + posicion1 + ") ");
    }

    public static boolean esMayor(int[] ask){
        int comprobador=Integer.MIN_VALUE;
        for (int i =0;i< ask.length;i++)
            if (ask[i] > comprobador){
                return true;
            }
        return false;
    }
    public static void imprimirArray(int[] lista) {
        for (int y = 0; y < lista.length; y++) {
            System.out.print(lista[y] + "(" + y + ") ");
        }
    }
    public static void insArray(int[] lista){
        for (int i=0;lista.length>i;i++){
            int num=0;
            num = esValido();
            lista[i]=num;
        }
    }
    public static int esValido(){
        int num  =0;
        while (!esPrimo(num)) {
            num = randomNum();
        }
        return num;
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

    private static int randomNum(){
        Random random = new Random();
        return random.nextInt(0,Integer.MAX_VALUE);
    }

}
