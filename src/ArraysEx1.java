import java.util.Scanner;

public class ArraysEx1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int array[] = new int[10];
        int ask;
        int posicion1=0,posicion2=0,mayor=Integer.MIN_VALUE,menor=Integer.MAX_VALUE;
        int i=0;
        for (i=0;i< array.length; i++){
            System.out.println("Escribe un número");
            ask = lector.nextInt();
            array[i] = ask;
            if (esMayor(ask)){
                posicion1=i;
                mayor=array[i];
            } else if ( esMenor(ask)) {
                posicion2=i;
                menor=array[i];
            }
        }
        System.out.println("El número mayor es " + mayor + " en la posición " + posicion1 + " y el menor es "+ menor + " en la posicion " + posicion2);
    }public static boolean esMayor(int ask){
        int comprobador=Integer.MIN_VALUE;
        if (ask > comprobador){
            comprobador = ask;
            return true;
        }
        return false;
    }
    public static boolean esMenor(int ask){
        int comprobador2=Integer.MAX_VALUE;
           if (ask < comprobador2){
               comprobador2 = ask;
               return true;
           }
        return false;
    }
}
